package com.rubenmoraapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.rubenmoraapi.models.Irsregiones;
import com.rubenmoraapi.models.Irsregionesapi;
import com.rubenmoraapi.services.Irsregionesservices;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class Irsregionescontroller {
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST","PUT", "DELETE");
            }
        };
    }
	
	@Autowired
	private Irsregionesservices irsregionesservices;

	@RequestMapping(value = "/regiones", method = RequestMethod.GET)
	public List<Irsregionesapi> index() {
		List<Irsregiones> employees =  irsregionesservices.findAll();
		List<Irsregionesapi> employeesRestList = new ArrayList<Irsregionesapi>();
		for (Irsregiones employee : employees) {
			Irsregionesapi employeesRest = new Irsregionesapi();
			employeesRest.setReg_numero(employee.getReg_numero());
			employeesRest.setReg_descripcion(employee.getReg_descripcion());
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}	
}
