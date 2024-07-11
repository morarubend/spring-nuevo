package com.mora.monitor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mora.monitor.models.Ctxenviovta;
import com.mora.monitor.repository.Ctxenviovtadao;


@Service("Ctxenviovtaservice")

public class Ctxenviovtaservice implements Ctxenviovtaservicei{
	@Autowired
	private Ctxenviovtadao ctxenviovtadao;
	
	public List<Ctxenviovta> findAll() {
		return (List<Ctxenviovta>) ctxenviovtadao.findAll();
	}
	
	@Transactional
	public String updateEstado(Ctxenviovta pos) {
		ctxenviovtadao.updateEstadoUsingQueryAnnotation(pos.getEnv_estado(),pos.getHed_pais(),pos.getHed_origentrx(),pos.getHed_local(),pos.getHed_pos(),pos.getHed_numtrx(), pos.getHed_fechatrx(), pos.getHed_horatrx());
		return "Record actualizado";
	}
	
}
