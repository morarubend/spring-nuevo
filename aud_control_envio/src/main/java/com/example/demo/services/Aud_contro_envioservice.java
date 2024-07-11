package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Aud_contro_enviom;
import com.example.demo.repository.Aud_contro_enviodao;

@Service("Aud_contro_envioservice")

public class Aud_contro_envioservice implements Aud_contro_envioservicei {
	@Autowired
	private Aud_contro_enviodao aud_contro_enviodao;
	
	public List<Aud_contro_enviom> findByClaveThanEqual() {
		return (List<Aud_contro_enviom>) aud_contro_enviodao.findByClaveThanEqual();
	}
}
