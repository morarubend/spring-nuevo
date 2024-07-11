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

import com.mora.monitor.models.Controlenvio;
import com.mora.monitor.models.Controlenvioapi;
import com.mora.monitor.sevices.Controlenvioservice;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class Controlenviocontroller {
	
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
	private Controlenvioservice controlenvioservice;
/*	
	@RequestMapping(value = "/controlenvio", method = RequestMethod.GET)
	public List<Controlenvioapi> index() {
		List<Controlenvio> employees =  controlenvioservice.findAll();
		List<Controlenvioapi> employeesRestList = new ArrayList<Controlenvioapi>();
		for (Controlenvio employee : employees) {
			Controlenvioapi employeesRest = new Controlenvioapi();
			employeesRest.setAce_local(employee.getAce_local());
			employeesRest.setAce_pos(employee.getAce_pos());			
			employeesRest.setAep_idcarga(employee.getAep_idcarga());
			employeesRest.setAce_estado(employee.getAce_estado());
			employeesRest.setAce_fconsulta(employee.getAce_fconsulta());	
			employeesRest.setAce_fgraba(employee.getAce_fgraba());
						
			if (employee.getEnviopos() != null) {			
      			employeesRest.setAep_data(employee.getEnviopos().getAep_data());
			}     			
      			
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}
*/	
	@RequestMapping(value = "/estadoupt", method = RequestMethod.PUT)
	@ResponseBody
	public String updatePos(@RequestBody Controlenvio controlenviopos) {
		String response = controlenvioservice.updateEstado(controlenviopos);
		return response;
	} 
	
	
	
	@RequestMapping(value = "/controlenvio", method = RequestMethod.POST)
	@ResponseBody
	public List<Controlenvioapi> index(@RequestBody Controlenvio controlenviopos) {
		System.out.println(controlenviopos);
		List<Controlenvio> employees =  controlenvioservice.findByClaveThanEqual(controlenviopos);
		List<Controlenvioapi> employeesRestList = new ArrayList<Controlenvioapi>();
		for (Controlenvio employee : employees) {
			Controlenvioapi employeesRest = new Controlenvioapi();
			employeesRest.setAce_local(employee.getAce_local());
			employeesRest.setAce_pos(employee.getAce_pos());			
			employeesRest.setAep_idcarga(employee.getAep_idcarga());
			employeesRest.setAce_estado(employee.getAce_estado());
			employeesRest.setAce_fconsulta(employee.getAce_fconsulta());	
			employeesRest.setAce_fgraba(employee.getAce_fgraba());
						
			if (employee.getEnviopos() != null) {			
      			employeesRest.setAep_data(employee.getEnviopos().getAep_data());
			}     			
      			
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}

}
