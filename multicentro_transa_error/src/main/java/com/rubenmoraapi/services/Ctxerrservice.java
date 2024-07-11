package com.rubenmoraapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rubenmoraapi.modelos.Ctxerrtx;
import com.rubenmoraapi.repository.Ctxerrdao;
@Service
public class Ctxerrservice implements Ctxerriservice {
	@Autowired
	private Ctxerrdao ctxerrdao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Ctxerrtx> findAll() {
		return (List<Ctxerrtx>) ctxerrdao.findAll();
	}
	
	@Transactional
	public String updateEstado(Ctxerrtx pos) {
		ctxerrdao.updateEstadoUsingQueryAnnotation(pos.getTxer_estado(), pos.getTxer_numero(), pos.getTxer_local());
		return "Record actualizado";
	}

/*
	@Override
	@Transactional(readOnly = true)
	public List<Ctxerrtx> findByDataAll() {
		return (List<Ctxerrtx>) ctxerrdao.findByDataAll();
	}
*/
}
