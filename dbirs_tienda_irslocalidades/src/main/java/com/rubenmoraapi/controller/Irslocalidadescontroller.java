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

import com.rubenmoraapi.models.Irslocalidades;
import com.rubenmoraapi.models.Irslocalidadesapi;
import com.rubenmoraapi.services.Irslocalidadesservices;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class Irslocalidadescontroller {
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
	private Irslocalidadesservices irslocalidadesservices;

	@RequestMapping(value = "/localidades", method = RequestMethod.GET)
	public List<Irslocalidadesapi> index() {
		List<Irslocalidades> employees =  irslocalidadesservices.findAll();
		List<Irslocalidadesapi> employeesRestList = new ArrayList<Irslocalidadesapi>();
		for (Irslocalidades employee : employees) {
			Irslocalidadesapi employeesRest = new Irslocalidadesapi();
			employeesRest.setLca_numero(employee.getLca_numero());
			employeesRest.setLca_descripcion(employee.getLca_descripcion());
			employeesRest.setCom_numero(employee.getCom_numero());
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}
}
