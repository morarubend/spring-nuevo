package com.rubenmoraapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rubenmoraapi.models.Irslocalespos;
import com.rubenmoraapi.repository.Irslocalesdao;

@Service("Irslocalesservice")

public class Irslocalesservice implements Irslocalesservicei{
	
	@Autowired
	private Irslocalesdao irslocalesdao;
	
	public List<Irslocalespos> findAll() {
		return (List<Irslocalespos>) irslocalesdao.findAll();
	}
/*
	public String isDataExist(Irslocalespos pos) {
		return irslocalesdao.findByLoc_numeroAndLpo_pos(pos.getLoc_numero(), pos.getLpo_pos());
	}
*/		
	@Override
	@Transactional
	public String insertPos(Irslocalespos pos) {		
		int loc_numero = pos.getLoc_numero();
		int lpo_pos = pos.getLpo_pos();	
		String lpo_numero = pos.getLpo_numero();
		String lpo_descripcion = pos.getLpo_descripcion();		
		String lpo_activo = pos.getLpo_activo();
		String lpo_ip = pos.getLpo_ip();
		String lpo_usrftp = pos.getLpo_usrftp();
		String lpo_pwdftp = pos.getLpo_pwdftp();
		String lpo_bbrpath = pos.getLpo_bbrpath();		
		irslocalesdao.insertPosUsingQueryAnnotation(loc_numero, lpo_pos, lpo_numero, lpo_descripcion, lpo_activo, lpo_ip, lpo_usrftp, lpo_pwdftp, lpo_bbrpath);
		return "Registro insertado";
	}
	
	@Transactional
	public Irslocalespos chequearPos(Irslocalespos pos) {
		Irslocalespos IrsPosLocales = new Irslocalespos();
		IrsPosLocales = irslocalesdao.readPosUsingQueryAnnotation(pos.getLoc_numero(), pos.getLpo_pos());
		return IrsPosLocales;
	}
	
	@Transactional
	public String updatePos(Irslocalespos pos) {
		irslocalesdao.updatePosUsingQueryAnnotation(pos.getLpo_activo(), pos.getLoc_numero(), pos.getLpo_pos());
		return "Record actualizado";
	}
		
}
