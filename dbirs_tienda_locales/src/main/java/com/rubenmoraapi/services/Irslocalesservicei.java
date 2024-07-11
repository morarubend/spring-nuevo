package com.rubenmoraapi.services;

import java.util.List;

import com.rubenmoraapi.models.Irslocales;

public interface Irslocalesservicei {
	
	public List<Irslocales> findAll();
	
	public Irslocales chequearLocal(Irslocales irslocales);

	public String insertLocal(Irslocales irslocales);

	public String updateLocal(Irslocales irslocales);
}
