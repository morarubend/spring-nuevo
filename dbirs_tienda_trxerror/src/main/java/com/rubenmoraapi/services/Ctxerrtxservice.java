package com.rubenmoraapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rubenmoraapi.models.Ctxerrtx;
import com.rubenmoraapi.repository.Ctxerrtxdao;
@Service
public class Ctxerrtxservice implements Ctxerrtxservicei{
	@Autowired
	private Ctxerrtxdao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Ctxerrtx> findAll() {
		return (List<Ctxerrtx>) clienteDao.findAll();
	}
	
	@Transactional
	public String updateEstado(Ctxerrtx pos) {
		clienteDao.updateEstadoUsingQueryAnnotation(pos.getTxer_estado(), pos.getTxer_numero());
		return "Record actualizado";
	}
	
	@Transactional
	public String updateEstadolote(Ctxerrtx pos) {
		clienteDao.updateEstadoUsingQueryAnnotation(pos.getTxer_estado(), pos.getTxer_numero());
		return "Record actualizado";
	}
	
	@Transactional
	public String updateTxertrx(Ctxerrtx pos) {
		clienteDao.updateTxertrxUsingQueryAnnotation(pos.getTxer_trx(), pos.getTxer_numero());
		return "Record actualizado";
	}
	
	@Transactional
	public String deleteTxertrx(Ctxerrtx pos) {
		clienteDao.deleteTxertrxUsingQueryAnnotation(pos.getTxer_numero());
		return "Record eliminado";
	}
	
    public Ctxerrtx saveCar(Ctxerrtx ctxerrtx) {
        return clienteDao.save(ctxerrtx);
    }


    public Ctxerrtx updateCar(Ctxerrtx ctxerrtx) {
        return clienteDao.save(ctxerrtx);
    }
}
