package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Aud_envio_pos;
import com.example.demo.repository.Aud_envio_posdao;

@Service("Aud_envio_posservice")

public class Aud_envio_posservice implements Aud_envio_posservicei {
	
	@Autowired
	private Aud_envio_posdao aud_envio_posdao;
	
	public List<Aud_envio_pos> findByClaveThanEqual(Aud_envio_pos pos) {
		return (List<Aud_envio_pos>) aud_envio_posdao.findByClaveThanEqual(pos.getAep_idcarga());
	}
}
