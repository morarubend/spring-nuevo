package com.rubenmoraapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.rubenmoraapi.models.Irslocalespos;
import com.rubenmoraapi.models.Localesposapi;
import com.rubenmoraapi.services.Irslocalesservice;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

//    @GetMapping("/locales")
	@RequestMapping(value = "/locales", method = RequestMethod.GET)
	public List<Localesposapi> index() {
		List<Irslocalespos> employees =  irslocalesservice.findAll();
		List<Localesposapi> employeesRestList = new ArrayList<Localesposapi>();
		for (Irslocalespos employee : employees) {
			Localesposapi employeesRest = new Localesposapi();
			employeesRest.setLpo_numero(employee.getLpo_numero());
			employeesRest.setLpo_descripcion(employee.getLpo_descripcion());
			employeesRest.setLpo_activo(employee.getLpo_activo());	
			employeesRest.setLoc_numero(employee.getLoc_numero());
			employeesRest.setLpo_pos(employee.getLpo_pos());			
			employeesRest.setLoc_descripcion(employee.getIrslocales().getLoc_descripcion());	
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}
    
	@RequestMapping(value = "/localescrea", method = RequestMethod.POST)
	@ResponseBody
	public String insertPos(@RequestBody Irslocalespos irslocalespos) {		
		Irslocalespos isData = irslocalesservice.chequearPos(irslocalespos);
		
		if (isData == null) {
			String response = irslocalesservice.insertPos(irslocalespos);
			return response;
		} 
		
		return "Existe"; 
		
		
	}

	@RequestMapping(value = "/localesupt", method = RequestMethod.PUT)
	@ResponseBody
	public String updatePos(@RequestBody Irslocalespos irslocalespos) {
		String response = irslocalesservice.updatePos(irslocalespos);
		return response;
	}

}
