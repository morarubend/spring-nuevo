package com.mora.monitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mora.monitor.dto.Leecontrolenviodto;
import com.mora.monitor.models.Leecontrolenvioapi;
import com.mora.monitor.repository.Leecontrolenviodao;

@Service("Leecontrolenvioservice")

public class Leecontrolenvioservice implements Leecontrolenvioservicei{

	@Autowired
	private Leecontrolenviodao leecontrolenviodao;
	
	public List<Leecontrolenviodto> findByClaveThanEqual(Leecontrolenvioapi pos) {
		return (List<Leecontrolenviodto>) leecontrolenviodao.findByClaveThanEqual(pos.getAce_estadot(), pos.getAce_fdesde(), pos.getAce_fhasta());
	}
}
