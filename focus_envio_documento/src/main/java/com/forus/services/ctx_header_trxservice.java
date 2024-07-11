package com.forus.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forus.models.ctx_header_trx;
import com.forus.repository.ctx_header_trxdao;

@Service()

public class ctx_header_trxservice implements ctx_header_trxservicei {
	
	@Autowired
	private ctx_header_trxdao ctxheadertrxdao;
	
	public List<ctx_header_trx> findAll() {
		return (List<ctx_header_trx>) ctxheadertrxdao.findAll();
	}
	
	@Transactional
	public List<ctx_header_trx> leerCtxheader(ctx_header_trx pos) {
		return (List<ctx_header_trx>) ctxheadertrxdao.readCtxheadertrxUsingQueryAnnotation(pos.getHed_local(), pos.getHed_numtrx(), pos.getHed_fechatrx(), pos.getHed_numdoc());
	}
	
	@Transactional
	public String updateEnvio(ctx_header_trx pos) {
		ctxheadertrxdao.updateEnviodteUsingQueryAnnotation(pos.getHed_enviodte(), pos.getHed_pais(), pos.getHed_origentrx(), pos.getHed_local(), pos.getHed_pos(), pos.getHed_numtrx(), pos.getHed_fechatrx(),pos.getHed_horatrx());
		return "Record actualizado";
	}

}
