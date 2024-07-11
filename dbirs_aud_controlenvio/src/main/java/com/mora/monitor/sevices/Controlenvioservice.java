package com.mora.monitor.sevices;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mora.monitor.models.Controlenvio;
import com.mora.monitor.repository.Controlenviodao;

@Service("Controlenvioservice")

public class Controlenvioservice implements Controlenvioservicei{
	
	@Autowired
	private Controlenviodao controlenviodao;
	
	public List<Controlenvio> findAll() {
		return (List<Controlenvio>) controlenviodao.findAll();
	}
		
	public List<Controlenvio> findByClaveThanEqual(Controlenvio pos) {
//		return (List<Controlenvio>) controlenviodao.findByClaveThanEqual(pos.getAce_estado(), pos.getAce_fconsulta(), pos.getAce_fgraba());
		return (List<Controlenvio>) controlenviodao.findByClaveThanEqual(pos.getAce_estado(), pos.getAce_fconsulta(), pos.getAce_fgraba());
	}
	
	@Transactional
	public String updateEstado(Controlenvio pos) {
		controlenviodao.updateEstadoUsingQueryAnnotation(pos.getAce_estado(), pos.getAce_local(), pos.getAce_pos(), pos.getAep_idcarga());
		return "Record actualizado";
	}

}
