package com.mora.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mora.modelo.Leeapi;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class Multicentro_loguincontroller {
	
	@Value("${login.usuario1}")
	private String loginUsuario1;
	
	@Value("${login.clave1}")
	private String loginClave1;
	
	@RequestMapping(value = "/loguin", method = RequestMethod.POST)
	public String getValue(@RequestBody Leeapi pos) {
		
		String siva = "SI";
		String nova = "NO";
		
		String usuario = (pos.getUsuario());
		String clave = (pos.getClave());
		
		System.out.println ("Usuario:  " + usuario);
		System.out.println ("Clave:    " + clave);
		System.out.println ("Usuario1: " + loginUsuario1);
		System.out.println ("Clave1:   " + loginClave1);
		
		if (usuario.equals(loginUsuario1) && clave.equals(loginClave1)) {		
			System.out.println ("Usuario1: " + loginUsuario1);
			System.out.println ("Clave1:   " + loginClave1);
			return siva;
		} 
		else { return nova; }
	
	}

}
