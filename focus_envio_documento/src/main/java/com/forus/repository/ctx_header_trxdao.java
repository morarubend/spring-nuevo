package com.forus.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.forus.models.ctx_header_trx;
import com.forus.models.ctx_header_trxid;

public interface ctx_header_trxdao extends JpaRepository<ctx_header_trx, ctx_header_trxid> {

//	@Query(value = "select * from ctx_header_trx where hed_numdoc = ?1", nativeQuery = true)
//	List<ctx_header_trx> readCtxheadertrxUsingQueryAnnotation(Integer hed_numdoc);
	
	@Query(value = "select * from ctx_header_trx where hed_local = ?1 AND hed_numtrx = ?2 AND hed_fechatrx = ?3 And hed_numdoc = ?4", nativeQuery = true)
	List<ctx_header_trx> readCtxheadertrxUsingQueryAnnotation(Integer hed_local, Integer hed_numtrx, LocalDate hed_fechatrx, Integer hed_numdoc);	

    @Transactional
    @Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "update CTX_HEADER_TRX SET hed_enviodte = ?1 where hed_pais = ?2 AND hed_origentrx = ?3 AND hed_local = ?4 AND hed_pos = ?5 AND hed_numtrx = ?6 AND hed_fechatrx = ?7 AND hed_horatrx = ?8", nativeQuery = true)
	public void updateEnviodteUsingQueryAnnotation(String hed_enviodte, Integer hed_pais, Integer hed_origentrx, Integer hed_local, Integer hed_pos, Integer hed_numtrx, LocalDate hed_fechatrx, LocalTime hed_horatrx);

}
