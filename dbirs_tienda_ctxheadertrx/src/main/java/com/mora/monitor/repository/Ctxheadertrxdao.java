package com.mora.monitor.repository;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mora.monitor.models.Ctxheadertrx;
import com.mora.monitor.models.Ctxheadertrxid;

public interface Ctxheadertrxdao extends JpaRepository<Ctxheadertrx, Ctxheadertrxid>{
	@Query(value = "select * from ctx_header_trx where hed_pais = ?1 and hed_origentrx = ?2 and hed_local = ?3 and hed_pos = ?4 and hed_numtrx = ?5 and hed_fechatrx = ?6 and hed_horatrx = ?7", nativeQuery = true)
	List<Ctxheadertrx> readDocumentoUsingQueryAnnotation(Integer hed_pais, Integer hed_origentrx, Integer hed_local, Integer hed_pos, Integer hed_numtrx, Date hed_fechatrx, Time hed_horatrx);
}
