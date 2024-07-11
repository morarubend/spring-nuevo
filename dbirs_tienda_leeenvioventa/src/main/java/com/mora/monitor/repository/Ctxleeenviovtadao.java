package com.mora.monitor.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.mora.monitor.models.Ctxleeenviovta;
import com.mora.monitor.models.Ctxleeenviovtaid;

public interface Ctxleeenviovtadao extends JpaRepository<Ctxleeenviovta, Ctxleeenviovtaid> {
//	@Query(value = "select * from CTX_ENVIO_VTA v WHERE v.hed_fechatrx BETWEEN :env_fechagraba AND :hed_fechatrx AND v.env_estado = :env_estado", nativeQuery = true)	
	@Query(value = "select * from CTX_ENVIO_VTA v WHERE v.hed_fechatrx >= :env_fechagraba AND v.hed_fechatrx <=:hed_fechatrx AND v.env_estado = :env_estado", nativeQuery = true)
	List<Ctxleeenviovta> findByClaveThanEqual(@Param("env_estado") String env_estado, @Param("env_fechagraba") LocalDate env_fechagraba, @Param("hed_fechatrx") LocalDate hed_fechatrx);
}
