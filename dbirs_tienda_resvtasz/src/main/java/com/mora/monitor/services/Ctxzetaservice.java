package com.mora.monitor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mora.monitor.models.Ctxzeta;
import com.mora.monitor.repository.Ctxzetadao;

@Service("Ctxzetaservice")

public class Ctxzetaservice implements Ctxzetaservicei {

	@Autowired
	private Ctxzetadao ctxzetadao;
	
	public List<Ctxzeta> findByClaveThanEqual(Ctxzeta pos) {
		return (List<Ctxzeta>) ctxzetadao.findByClaveThanEqual(pos.getZ_fechacont(), pos.getRpl_fecha_graba());
	}
	
}
