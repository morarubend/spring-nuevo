package com.mora.monitor.controller;

import java.time.LocalDate;
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

import com.mora.monitor.models.Ctxleeenviovta;
import com.mora.monitor.models.Ctxleeenviovtaapi;
import com.mora.monitor.services.Ctxleeenviovtaservice;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class Ctxleeenviovtacontroller {
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
	private Ctxleeenviovtaservice ctxleeenviovtaservice;

	@RequestMapping(value = "/enviovta", method = RequestMethod.POST)
	@ResponseBody
	public List<Ctxleeenviovtaapi> index(@RequestBody Ctxleeenviovta ctxleeenviovtapos) {
		
		String verestado = (ctxleeenviovtapos.getEnv_estado());
		LocalDate verdesde = (ctxleeenviovtapos.getEnv_fechagraba());
		LocalDate verhasta = (ctxleeenviovtapos.getHed_fechatrx());
		System.out.println ("Estado " + verestado);
		System.out.println ("Desde " + verdesde);
		System.out.println ("Hasta " + verhasta);			
		
		List<Ctxleeenviovta> employees =  ctxleeenviovtaservice.findByClaveThanEqual(ctxleeenviovtapos);
		List<Ctxleeenviovtaapi> employeesRestList = new ArrayList<Ctxleeenviovtaapi>();
		for (Ctxleeenviovta employee : employees) {
			Ctxleeenviovtaapi employeesRest = new Ctxleeenviovtaapi();
			employeesRest.setHed_pais(employee.getHed_pais());
			employeesRest.setHed_origentrx(employee.getHed_origentrx());			
			employeesRest.setHed_local(employee.getHed_local());
			employeesRest.setHed_pos(employee.getHed_pos());
			employeesRest.setHed_numtrx(employee.getHed_numtrx());	
			employeesRest.setHed_fechatrx(employee.getHed_fechatrx());
			employeesRest.setHed_horatrx(employee.getHed_horatrx());
			employeesRest.setEnv_idtrx(employee.getEnv_idtrx());			
			employeesRest.setEnv_estado(employee.getEnv_estado());			
			employeesRest.setEnv_data(employee.getEnv_data());			
			employeesRest.setEnv_response(employee.getEnv_response());
/*			
			if (employee.getCtxheadertrx() != null) {			
      			employeesRest.setHed_numdoc(employee.getCtxheadertrx().getHed_numdoc());
			}     			
*/      			
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}
}
