package com.rubenmoraapi.services;

import java.util.List;

import com.rubenmoraapi.models.Irslocalespos;

public interface Irslocalesservicei {
	
	public List<Irslocalespos> findAll();
	
	public Irslocalespos chequearPos(Irslocalespos irslocalespos);
	
	//public Irslocalespos isDataExist(Irslocalespos irslocalespos);
	
	public String insertPos(Irslocalespos irslocalespos);

	public String updatePos(Irslocalespos irslocalespos);
	
}
