package com.rubenmoraapi.controller;

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

import com.rubenmoraapi.models.Irslocales;
import com.rubenmoraapi.models.Localesapi;
import com.rubenmoraapi.services.Irslocalesservice;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class Irslocalescontroller {

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
	private Irslocalesservice irslocalesservice;

	@RequestMapping(value = "/locales", method = RequestMethod.GET)
	public List<Localesapi> index() {
		List<Irslocales> employees =  irslocalesservice.findAll();
		List<Localesapi> employeesRestList = new ArrayList<Localesapi>();
		for (Irslocales employee : employees) {
			Localesapi employeesRest = new Localesapi();
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
    
    
	@RequestMapping(value = "/localescrea", method = RequestMethod.POST)
	@ResponseBody
	public String insertPos(@RequestBody Irslocales irslocalespos) {		
		Irslocales isData = irslocalesservice.chequearLocal(irslocalespos);
		
		if (isData == null) {
			String response = irslocalesservice.insertLocal(irslocalespos);
			return response;
		} 
		
		return "Existe"; 		
	}

	@RequestMapping(value = "/localesupt", method = RequestMethod.PUT)
	@ResponseBody
	public String updatePos(@RequestBody Irslocales irslocalespos) {
		String response = irslocalesservice.updateLocal(irslocalespos);
		return response;
	}   
 
}
