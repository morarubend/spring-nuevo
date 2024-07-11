package com.locales.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locales.demo.model.Irs_locales;
import com.locales.demo.repository.Irs_localesdao;

@Service("Irs_localesservice")

public class Irs_localesservice implements Irs_localesservicei {
	@Autowired
	private Irs_localesdao irs_localesdao;
	
	public List<Irs_locales> findAll() {
		return (List<Irs_locales>) irs_localesdao.findAll();
	}
}
