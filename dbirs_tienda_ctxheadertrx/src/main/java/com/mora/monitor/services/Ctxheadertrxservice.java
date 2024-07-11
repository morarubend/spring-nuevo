package com.mora.monitor.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mora.monitor.models.Ctxheadertrx;
import com.mora.monitor.repository.Ctxheadertrxdao;
@Service
public class Ctxheadertrxservice implements Ctxheadertrxservicei{
	@Autowired
	private Ctxheadertrxdao ctxheadertrxdao;
	
	public List<Ctxheadertrx> findAll() {
		return (List<Ctxheadertrx>) ctxheadertrxdao.findAll();
	}
	
	@Transactional
	public List<Ctxheadertrx> leerDocumento(Ctxheadertrx pos) {
		return (List<Ctxheadertrx>) ctxheadertrxdao.readDocumentoUsingQueryAnnotation(pos.getHed_pais(), pos.getHed_origentrx(), pos.getHed_local(), pos.getHed_pos(), pos.getHed_numtrx(), pos.getHed_fechatrx(), pos.getHed_horatrx());
	}
}
