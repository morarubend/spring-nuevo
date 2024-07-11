package com.rubenmoraapi.services;

import java.util.List;

import com.rubenmoraapi.models.Ctxerrtx;

public interface Ctxerrtxservicei {
	
	public List<Ctxerrtx> findAll();
	
	public String updateEstado(Ctxerrtx ctxerrtx);
	
	public String updateEstadolote(Ctxerrtx ctxerrtx);
	
	public String updateTxertrx(Ctxerrtx ctxerrtx);
	
	public String deleteTxertrx(Ctxerrtx ctxerrtx);
}
