package com.locales.demo.controller;

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

import com.locales.demo.model.Irs_locales;
import com.locales.demo.model.Irs_localesapi;
import com.locales.demo.service.Irs_localesservice;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class Irs_localescontroller {
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
	private Irs_localesservice irs_localesservice;

	@RequestMapping(value = "/locales", method = RequestMethod.GET)
	public List<Irs_localesapi> index() {
		List<Irs_locales> employees =  irs_localesservice.findAll();
		List<Irs_localesapi> employeesRestList = new ArrayList<Irs_localesapi>();
		for (Irs_locales employee : employees) {
			Irs_localesapi employeesRest = new Irs_localesapi();
			employeesRest.setLoc_numero(employee.getLoc_numero());
			employeesRest.setLoc_descripcion(employee.getLoc_descripcion());
			employeesRest.setLoc_activo(employee.getLoc_activo());	
			employeesRest.setReg_numero(employee.getReg_numero());			
			employeesRest.setLoc_rut(employee.getLoc_rut());
			employeesRest.setLoc_direccion(employee.getLoc_direccion());
			employeesRest.setLoc_comuna(employee.getLoc_comuna());
			employeesRest.setLoc_ciudad(employee.getLoc_ciudad());
			employeesRest.setLoc_region(employee.getReg_numero());
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}	
}
