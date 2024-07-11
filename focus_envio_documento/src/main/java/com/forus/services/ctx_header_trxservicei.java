package com.forus.services;

import java.util.List;

import com.forus.models.ctx_header_trx;

public interface ctx_header_trxservicei {
	
	public List<ctx_header_trx> findAll();
	public List<ctx_header_trx> leerCtxheader(ctx_header_trx ctxheadertrx);
	public String updateEnvio(ctx_header_trx ctxheadertrx);
}
