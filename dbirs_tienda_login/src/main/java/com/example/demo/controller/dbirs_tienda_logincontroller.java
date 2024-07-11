package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Leeapi;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class dbirs_tienda_logincontroller {
		
	@Value("${login.usuario1}")
	private String loginUsuario1;
	
	@Value("${login.clave1}")
	private String loginClave1;
	
	@Value("${login.usuario2:javadoubts}")
	private String loginUsuario2;
	
	@Value("${login.clave2:javadoubts}")
	private String loginClave2;
	
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
		System.out.println ("Usuario2: " + loginUsuario2);
		System.out.println ("Clave2:   " + loginClave2);
		
		if (usuario.equals(loginUsuario1) && clave.equals(loginClave1)) {		
			System.out.println ("Usuario1: " + loginUsuario1);
			System.out.println ("Clave1:   " + loginClave1);
			return siva;
		} 
		else if (usuario.equals(loginUsuario2) && clave.equals(loginClave2)) {
			System.out.println ("Usuario2: " + loginUsuario2);
			System.out.println ("Clave2:   " + loginClave2);
			return siva;
		} 
		else { return nova; }
	
	}
}
