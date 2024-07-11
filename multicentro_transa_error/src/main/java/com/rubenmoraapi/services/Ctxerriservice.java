package com.rubenmoraapi.services;

import java.util.List;

import com.rubenmoraapi.modelos.Ctxerrtx;

public interface Ctxerriservice {
	public List<Ctxerrtx> findAll();
	public String updateEstado(Ctxerrtx ctxerrtx);
}
