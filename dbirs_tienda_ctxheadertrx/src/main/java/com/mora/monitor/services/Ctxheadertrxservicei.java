package com.mora.monitor.services;

import java.util.List;

import com.mora.monitor.models.Ctxheadertrx;

public interface Ctxheadertrxservicei {
	public List<Ctxheadertrx> findAll();
	public List<Ctxheadertrx> leerDocumento(Ctxheadertrx ctxheadertrx);
}
