package com.mora.monitor.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mora.monitor.models.Ctxzeta;
import com.mora.monitor.models.Ctxzetaid;

public interface Ctxzetadao extends JpaRepository<Ctxzeta, Ctxzetaid> {

	@Query(value = "select * from CTX_ZETA WHERE z_fechacont BETWEEN :z_fechacont AND :rpl_fecha_graba", nativeQuery = true)
	List<Ctxzeta> findByClaveThanEqual(@Param("z_fechacont") LocalDate z_fechacont, @Param("rpl_fecha_graba") LocalDate rpl_fecha_graba);
	
}
