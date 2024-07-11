package com.mora.monitor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mora.monitor.models.Ctx_zeta;
import com.mora.monitor.repository.Ctx_zetadao;

@Service("Ctx_zetaservice")

public class Ctx_zetaservice implements Ctx_zetaservicei {
	
	@Autowired
	private Ctx_zetadao ctx_zetadao;
	
	public List<Ctx_zeta> findByClaveThanEqual(Ctx_zeta pos) {
		return (List<Ctx_zeta>) ctx_zetadao.findByClaveThanEqual(pos.getZ_fechacont(), pos.getRpl_fecha_graba());
	}

}
