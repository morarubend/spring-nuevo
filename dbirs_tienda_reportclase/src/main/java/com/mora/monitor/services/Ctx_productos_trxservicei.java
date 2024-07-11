package com.mora.monitor.services;

import java.util.List;

import com.mora.monitor.dto.Ctx_productos_trxdto;
import com.mora.monitor.models.Ctx_productos_trx;

public interface Ctx_productos_trxservicei {
	public List<Ctx_productos_trxdto> findByClaveThanEqual(Ctx_productos_trx ctx_productos_trx);
	public List<Ctx_productos_trxdto> findProductosdto(Ctx_productos_trx ctx_productos_trx);
	public List<Ctx_productos_trx> findAll();
}
