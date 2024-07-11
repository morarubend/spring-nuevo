package com.rubenmoraapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.rubenmoraapi.models.Ctxerrtx;

public interface Ctxerrtxdao extends JpaRepository<Ctxerrtx, Long> {
	
    @Transactional
    @Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "update CTX_ERRTX SET txer_estado = :txer_estado WHERE txer_numero = :txer_numero", nativeQuery = true)
	public void updateEstadoUsingQueryAnnotation(@Param("txer_estado") Integer txer_estado, @Param("txer_numero") Long txer_numero);

    
    @Transactional
    @Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "update CTX_ERRTX SET txer_estado = :txer_estado WHERE txer_numero = :txer_numero", nativeQuery = true)
	public void updateEstadoloteUsingQueryAnnotation(@Param("txer_estado") Integer txer_estado, @Param("txer_numero") Long txer_numero);
    
    @Transactional
    @Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "update CTX_ERRTX SET txer_trx = :txer_trx WHERE txer_numero = :txer_numero", nativeQuery = true)
	public void updateTxertrxUsingQueryAnnotation(@Param("txer_trx") String txer_trx, @Param("txer_numero") Long txer_numero);
     
    @Transactional
    @Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "delete from CTX_ERRTX WHERE txer_numero = :txer_numero", nativeQuery = true)
	public void deleteTxertrxUsingQueryAnnotation(@Param("txer_numero") Long txer_numero);
}
