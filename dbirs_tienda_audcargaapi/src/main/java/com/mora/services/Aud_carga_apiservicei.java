package com.mora.services;

import java.util.List;

import com.mora.dto.Aud_carga_apidto;
import com.mora.dto.Aud_carga_apiparam;

public interface Aud_carga_apiservicei {
	
	public List<Aud_carga_apidto> findByClaveThanEqual(Aud_carga_apiparam aud_carga_apiparam);
	public String updateEstado(Aud_carga_apiparam audcargaapi);
}
