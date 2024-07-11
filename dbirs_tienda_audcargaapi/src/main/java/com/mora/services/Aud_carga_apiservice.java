package com.mora.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mora.dto.Aud_carga_apidto;
import com.mora.dto.Aud_carga_apiparam;
import com.mora.repository.Aud_carga_apidao;

@Service("Aud_carga_apiservice")

public class Aud_carga_apiservice implements Aud_carga_apiservicei {

	@Autowired
	private Aud_carga_apidao aud_carga_apidao;
	
	public List<Aud_carga_apidto> findByClaveThanEqual(Aud_carga_apiparam pos) {
		return (List<Aud_carga_apidto>) aud_carga_apidao.findByClaveThanEqual(pos.getAud_estado(), pos.getAud_fdesde(), pos.getAud_fhasta());
	}
	
	@Transactional
	public String updateEstado(Aud_carga_apiparam pos) {
		aud_carga_apidao.updateEstadoUsingQueryAnnotation(pos.getAud_estado(), pos.getAud_idcarga());
		return "Record actualizado";
	}
	
	
}
