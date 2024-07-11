package com.mora.monitor.service;

import java.util.List;

import com.mora.monitor.dto.Leecontrolenviodto;
import com.mora.monitor.models.Leecontrolenvioapi;

public interface Leecontrolenvioservicei {
	public List<Leecontrolenviodto> findByClaveThanEqual(Leecontrolenvioapi leecontrolenvioapi);
}
