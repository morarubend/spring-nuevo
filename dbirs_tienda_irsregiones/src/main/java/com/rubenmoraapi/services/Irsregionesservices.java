package com.rubenmoraapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubenmoraapi.models.Irsregiones;
import com.rubenmoraapi.repository.Irsregionesdao;

@Service
public class Irsregionesservices implements Irsregionesservicesi{
	@Autowired
	private Irsregionesdao irsregionesdao;
	
	public List<Irsregiones> findAll() {
		return (List<Irsregiones>) irsregionesdao.findAll();
	}
}
