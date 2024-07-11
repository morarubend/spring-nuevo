package com.mora.monitor.services;

import java.util.List;

import com.mora.monitor.models.Ctxenviovta;

public interface Ctxenviovtaservicei {
	public List<Ctxenviovta> findAll();
	public String updateEstado(Ctxenviovta ctxenviovta);
}
