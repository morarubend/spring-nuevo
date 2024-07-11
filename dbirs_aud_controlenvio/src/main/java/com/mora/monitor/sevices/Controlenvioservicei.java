package com.mora.monitor.sevices;

import java.util.List;

import com.mora.monitor.models.Controlenvio;

public interface Controlenvioservicei {
	
	public List<Controlenvio> findAll();
	public String updateEstado(Controlenvio controlenvio);	
	public List<Controlenvio> findByClaveThanEqual(Controlenvio controlenvio);

}
