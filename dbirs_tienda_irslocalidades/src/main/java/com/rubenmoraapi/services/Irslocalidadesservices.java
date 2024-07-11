package com.rubenmoraapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubenmoraapi.models.Irslocalidades;
import com.rubenmoraapi.repository.Irslocalidadesdao;

@Service
public class Irslocalidadesservices implements Irslocalidadesservicesi {
	@Autowired
	private Irslocalidadesdao irslocalidadesdao;
	
	public List<Irslocalidades> findAll() {
		return (List<Irslocalidades>) irslocalidadesdao.findAll();
	}
}
