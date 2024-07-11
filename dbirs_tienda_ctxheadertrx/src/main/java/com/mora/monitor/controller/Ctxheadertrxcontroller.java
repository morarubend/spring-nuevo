package com.mora.monitor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mora.monitor.models.Ctxheadertrx;
import com.mora.monitor.models.Ctxheadertrxapi;
import com.mora.monitor.services.Ctxheadertrxservice;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class Ctxheadertrxcontroller {
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
	private Ctxheadertrxservice ctxheadertrxservice;

	@RequestMapping(value = "/documentos", method = RequestMethod.GET)
	public List<Ctxheadertrxapi> index() {
		List<Ctxheadertrx> employees =  ctxheadertrxservice.findAll();
		List<Ctxheadertrxapi> employeesRestList = new ArrayList<Ctxheadertrxapi>();
		for (Ctxheadertrx employee : employees) {
			Ctxheadertrxapi employeesRest = new Ctxheadertrxapi();
			employeesRest.setHed_pais(employee.getHed_pais());
			employeesRest.setHed_origentrx(employee.getHed_origentrx());
			employeesRest.setHed_local(employee.getHed_local());
			employeesRest.setHed_pos(employee.getHed_pos());
			employeesRest.setHed_numtrx(employee.getHed_numtrx());
			employeesRest.setHed_fechatrx(employee.getHed_fechatrx());
			employeesRest.setHed_horatrx(employee.getHed_horatrx());			
			employeesRest.setHed_numdoc(employee.getHed_numdoc());
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}
	
	@RequestMapping(value = "/documento", method = RequestMethod.POST)
	@ResponseBody
	public List<Ctxheadertrxapi> index(@RequestBody Ctxheadertrx ctxheadertrx) {
		List<Ctxheadertrx> employees =  ctxheadertrxservice.leerDocumento(ctxheadertrx);
		List<Ctxheadertrxapi> employeesRestList = new ArrayList<Ctxheadertrxapi>();
		for (Ctxheadertrx employee : employees) {
			Ctxheadertrxapi employeesRest = new Ctxheadertrxapi();
			employeesRest.setHed_local(employee.getHed_local());
			employeesRest.setHed_pos(employee.getHed_pos());
			employeesRest.setHed_numtrx(employee.getHed_numtrx());
			employeesRest.setHed_fechatrx(employee.getHed_fechatrx());
			employeesRest.setHed_horatrx(employee.getHed_horatrx());
			employeesRest.setHed_numdoc(employee.getHed_numdoc());
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}
}
