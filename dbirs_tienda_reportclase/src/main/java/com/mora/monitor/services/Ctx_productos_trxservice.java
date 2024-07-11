package com.mora.monitor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mora.monitor.dto.Ctx_productos_trxdto;
import com.mora.monitor.models.Ctx_productos_trx;
import com.mora.monitor.repository.Ctx_productos_trxdao;

@Service("Ctx_productos_trxservice")
public class Ctx_productos_trxservice implements Ctx_productos_trxservicei {
	
	@Autowired
	private Ctx_productos_trxdao ctx_productos_trxdao;
	
	public List<Ctx_productos_trxdto> findByClaveThanEqual(Ctx_productos_trx pos) {
		return (List<Ctx_productos_trxdto>) ctx_productos_trxdao.findByClaveThanEqual(pos.getPtr_fcontable(), pos.getPtr_feccomporig());
	}
	
	public List<Ctx_productos_trxdto> findProductosdto(Ctx_productos_trx pos) {
		return (List<Ctx_productos_trxdto>) ctx_productos_trxdao.findProductosdto(pos.getPtr_fcontable(), pos.getPtr_feccomporig());
	}
	
	public List<Ctx_productos_trx> findAll() {
		List<Ctx_productos_trx> listCtx = ctx_productos_trxdao.findAll();
		return listCtx;
	}
	
}
