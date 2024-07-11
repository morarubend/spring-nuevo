package com.rubenmoraapi.services;

import java.util.List;

import com.rubenmoraapi.modelos.Monauditoria;

public interface Monauditoriaservicei {
	public List<Monauditoria> findAll();
	
	public Monauditoria insert(Monauditoria monauditoria);
	
	public String insertAuditoria(Monauditoria monauditoria);
}
