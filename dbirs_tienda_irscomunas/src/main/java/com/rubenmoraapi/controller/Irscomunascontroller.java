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

import com.rubenmoraapi.models.Irscomunas;
import com.rubenmoraapi.models.Irscomunasapi;
import com.rubenmoraapi.services.Irscomunasservices;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class Irscomunascontroller {
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
	private Irscomunasservices irscomunasservices;

	@RequestMapping(value = "/comunas", method = RequestMethod.GET)
	public List<Irscomunasapi> index() {
		List<Irscomunas> employees =  irscomunasservices.findAll();
		List<Irscomunasapi> employeesRestList = new ArrayList<Irscomunasapi>();
		for (Irscomunas employee : employees) {
			Irscomunasapi employeesRest = new Irscomunasapi();
			employeesRest.setCom_numero(employee.getCom_numero());
			employeesRest.setCom_descripcion(employee.getCom_descripcion());
			employeesRest.setReg_numero(employee.getReg_numero());
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}
}
