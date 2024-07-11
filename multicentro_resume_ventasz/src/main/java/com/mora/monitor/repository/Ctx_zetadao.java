package com.mora.monitor.repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mora.monitor.models.Ctx_zeta;
import com.mora.monitor.models.Ctx_zetaid;

public interface Ctx_zetadao extends JpaRepository<Ctx_zeta, Ctx_zetaid> {
	
	@Query(value = "select * from CTX_ZETA WHERE z_fechacont BETWEEN :z_fechacont AND :rpl_fecha_graba", nativeQuery = true)
	List<Ctx_zeta> findByClaveThanEqual(@Param("z_fechacont") LocalDate z_fechacont, @Param("rpl_fecha_graba") LocalDate rpl_fecha_graba);

}
