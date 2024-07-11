package com.mora.monitor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mora.monitor.models.Ctxleeenviovta;
import com.mora.monitor.repository.Ctxleeenviovtadao;

@Service("Ctxleeenviovtaservice")

public class Ctxleeenviovtaservice implements Ctxleeenviovtaservicei {
	@Autowired
	private Ctxleeenviovtadao ctxleeenviovtadao;
	
	public List<Ctxleeenviovta> findByClaveThanEqual(Ctxleeenviovta pos) {
		return (List<Ctxleeenviovta>) ctxleeenviovtadao.findByClaveThanEqual(pos.getEnv_estado(), pos.getEnv_fechagraba(), pos.getHed_fechatrx());
	}
}
