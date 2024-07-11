package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Aud_envio_pos;

public interface Aud_envio_posservicei {
	public List<Aud_envio_pos> findByClaveThanEqual(Aud_envio_pos aud_envio_pos);
}
