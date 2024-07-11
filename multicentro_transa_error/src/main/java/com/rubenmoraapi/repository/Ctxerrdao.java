package com.rubenmoraapi.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.rubenmoraapi.modelos.Ctxerrtx;
import com.rubenmoraapi.modelos.Ctxerrtxid;

public interface Ctxerrdao extends JpaRepository<Ctxerrtx, Ctxerrtxid>{

//	@Query(value = "select * from CTX_ERRTX", nativeQuery = true)
//	List<Ctxerrtx> findByDataAll();
		
    @Transactional
    @Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "update CTX_ERRTX SET txer_estado = :txer_estado WHERE txer_numero = :txer_numero AND txer_local = :txer_local", nativeQuery = true)
	public void updateEstadoUsingQueryAnnotation(@Param("txer_estado") Integer txer_estado, @Param("txer_numero") Integer txer_numero, @Param("txer_local") Integer txer_local);

}
