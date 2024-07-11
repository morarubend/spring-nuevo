package com.rubenmoraapi.repository;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rubenmoraapi.modelos.Monauditoria;

public interface Monauditoriadao extends JpaRepository<Monauditoria, Long> {
	@Modifying
	@Query(value = "insert into mon_auditoria (aud_idregistro,aud_usuario,aud_sistema,aud_cliente,aud_fecha,aud_hora,aud_modulo,"
			+ "aud_tiporeg,aud_registro_afectado,aud_valor_inicio,aud_valor_fin,aud_observaciones)"
			+ "VALUES(:aud_idregistro,:aud_usuario,:aud_sistema,:aud_cliente,:aud_fecha,:aud_hora,:aud_modulo,:aud_tiporeg,"
			+ ":aud_registro_afectado,:aud_valor_inicio,:aud_valor_fin,:aud_observaciones)", nativeQuery = true)
	public void insertAuditoriaUsingQueryAnnotation(@Param("aud_idregistro") Long aud_idregistro,@Param("aud_usuario") String aud_usuario, @Param("aud_sistema") String aud_sistema,
			@Param("aud_cliente") String aud_cliente, @Param("aud_fecha") Date aud_fecha,
			@Param("aud_hora") Time aud_hora, @Param("aud_modulo") String aud_modulo, @Param("aud_tiporeg") String aud_tiporeg,
			@Param("aud_registro_afectado") String aud_registro_afectado, @Param("aud_valor_inicio") String aud_valor_inicio, @Param("aud_valor_fin") String aud_valor_fin,
			@Param("aud_observaciones") String aud_observaciones);
}
