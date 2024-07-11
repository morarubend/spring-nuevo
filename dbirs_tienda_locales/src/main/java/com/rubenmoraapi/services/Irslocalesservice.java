package com.rubenmoraapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rubenmoraapi.models.Irslocales;
import com.rubenmoraapi.repository.Irslocalesdao;

@Service("Irslocalesservice")
public class Irslocalesservice implements Irslocalesservicei {
	
	@Autowired
	private Irslocalesdao irslocalesdao;
	
	public List<Irslocales> findAll() {
		return (List<Irslocales>) irslocalesdao.findAll();
	}
		
	@Override
	@Transactional
	public String insertLocal(Irslocales pos) {		
		Long loc_numero = pos.getLoc_numero();
		String loc_descripcion = pos.getLoc_descripcion();	
		String loc_tipo = "L";
		String loc_activo = pos.getLoc_activo();		
		int reg_numero = pos.getReg_numero();
		int cad_numero = 1;
		int loc_porcbase = 0;
		String loc_tipocua = null;
		String loc_rut = pos.getLoc_rut();			
		String loc_centrocosto = "5";	
		int loc_codcomercio2 = 0;
		String loc_sociedad = "BP01";		
		String loc_division = "N";
//		int loc_tipocambio = pos.getLoc_tipocambio();
		int loc_tipocambio = 0;
		String mon_codigo = "1";
		int loc_monedabase = 0;
		String loc_deposito = "A";	
		String loc_ip2 = null;	
		String loc_ip = null;
		String loc_direccion = pos.getLoc_direccion();		
		String loc_comuna = pos.getLoc_comuna();
		String loc_ciudad = pos.getLoc_ciudad();
		String loc_descorta = null;
		String loc_cprecio = null;
		String loc_stkbatch = null;		
		String loc_aplicadte = null;	
		String loc_codigoos = null;
		String loc_usrftp = null;		
		String loc_pwdftp = null;
		String loc_bbrpath = null;
		String loc_orgcomprasap = null;
		String loc_orgvtasap = null;
		String loc_modovtacomb = "P";		
		int zon_codigo = 1;	
		String loc_tiposap = null;
		int loc_litroscalib = 0;		
		int loc_numturnos = 0;
		int loc_maqaspirado = 0;
		String loc_numerosap = "S";
		int loc_numeropmm = 0;
		int loc_tinactividad = 0;	
		int loc_idclientecons = 0;
		String loc_extractor = "S";
		int loc_origentrx = 3;		
		irslocalesdao.insertLocalUsingQueryAnnotation(loc_numero, loc_descripcion, loc_tipo, loc_activo,
				reg_numero,cad_numero, loc_porcbase, loc_tipocua, loc_rut, loc_centrocosto, loc_codcomercio2,
				loc_sociedad, loc_division, loc_tipocambio, mon_codigo, loc_monedabase, loc_deposito,
				loc_ip2, loc_ip, loc_direccion, loc_comuna, loc_ciudad, loc_descorta, loc_cprecio, loc_stkbatch,
				loc_aplicadte, loc_codigoos, loc_usrftp, loc_pwdftp, loc_bbrpath, loc_orgcomprasap, loc_orgvtasap,
				loc_modovtacomb, zon_codigo, loc_tiposap, loc_litroscalib, loc_numturnos, loc_maqaspirado, loc_numerosap,
				loc_numeropmm, loc_tinactividad, loc_idclientecons, loc_extractor, loc_origentrx);
		return "Registro insertado";
	}
	
	@Transactional
	public Irslocales chequearLocal(Irslocales pos) {
		Irslocales IrsPosLocales = new Irslocales();
		IrsPosLocales = irslocalesdao.readLocalUsingQueryAnnotation(pos.getLoc_numero());
		return IrsPosLocales;
	}
	
	@Transactional
	public String updateLocal(Irslocales pos) {
		irslocalesdao.updateLocalUsingQueryAnnotation(pos.getLoc_activo(), pos.getLoc_rut(), pos.getLoc_numero());
		return "Record actualizado";
	}

}
