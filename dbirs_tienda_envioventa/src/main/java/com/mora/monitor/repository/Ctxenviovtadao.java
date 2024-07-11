package com.mora.monitor.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mora.monitor.models.Ctxenviovta;
import com.mora.monitor.models.Ctxenviovtaid;

public interface Ctxenviovtadao extends JpaRepository<Ctxenviovta, Ctxenviovtaid>{

    @Transactional
    @Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "update CTX_ENVIO_VTA SET env_estado = :env_estado WHERE hed_pais = :hed_pais AND hed_origentrx = :hed_origentrx AND hed_local = :hed_local AND hed_pos = :hed_pos AND hed_numtrx = :hed_numtrx AND hed_fechatrx = :hed_fechatrx AND hed_horatrx = :hed_horatrx", nativeQuery = true)
	public void updateEstadoUsingQueryAnnotation(@Param("env_estado") String env_estado, @Param("hed_pais") Integer hed_pais, @Param("hed_origentrx") Integer hed_origentrx, @Param("hed_local") Integer hed_local, @Param("hed_pos") Integer hed_pos, @Param("hed_numtrx") Integer hed_numtrx, @Param("hed_fechatrx") LocalDateTime hed_fechatrx, @Param("hed_horatrx") LocalDateTime hed_horatrx);
	
}
