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

import com.mora.monitor.models.Ctxenviovta;
import com.mora.monitor.models.Ctxenviovtaapi;
import com.mora.monitor.services.Ctxenviovtaservice;



@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class Ctxenviovtacontroller {
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
	private Ctxenviovtaservice ctxenviovtaservice;

	@RequestMapping(value = "/enviovta", method = RequestMethod.GET)
	public List<Ctxenviovtaapi> index() {
		List<Ctxenviovta> employees =  ctxenviovtaservice.findAll();
		List<Ctxenviovtaapi> employeesRestList = new ArrayList<Ctxenviovtaapi>();
		for (Ctxenviovta employee : employees) {
			Ctxenviovtaapi employeesRest = new Ctxenviovtaapi();
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
	
	@RequestMapping(value = "/estadoupt", method = RequestMethod.PUT)
	@ResponseBody
	public String updatePos(@RequestBody Ctxenviovta ctxenviovtapos) {
		String response = ctxenviovtaservice.updateEstado(ctxenviovtapos);
		return response;
	} 
	
}
