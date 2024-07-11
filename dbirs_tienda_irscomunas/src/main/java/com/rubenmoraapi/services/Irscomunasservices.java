package com.rubenmoraapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubenmoraapi.models.Irscomunas;
import com.rubenmoraapi.repository.Irscomunasdao;

@Service
public class Irscomunasservices implements Irscomunasservicesi {
	@Autowired
	private Irscomunasdao irscomunasdao;
	
	public List<Irscomunas> findAll() {
		return (List<Irscomunas>) irscomunasdao.findAll();
	}
}
