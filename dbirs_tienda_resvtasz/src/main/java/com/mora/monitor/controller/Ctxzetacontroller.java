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

import com.mora.monitor.models.Ctxzeta;
import com.mora.monitor.models.Ctxzetaapi;
import com.mora.monitor.services.Ctxzetaservice;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class Ctxzetacontroller {
	
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
	private Ctxzetaservice ctxzetaservice;
	
	@RequestMapping(value = "/getzeta", method = RequestMethod.POST)
	@ResponseBody
	public List<Ctxzetaapi> index(@RequestBody Ctxzeta ctxzetapos) {
		List<Ctxzeta> employees =  ctxzetaservice.findByClaveThanEqual(ctxzetapos);
		List<Ctxzetaapi> employeesRestList = new ArrayList<Ctxzetaapi>();
		for (Ctxzeta employee : employees) {
			Ctxzetaapi employeesRest = new Ctxzetaapi();
			employeesRest.setZ_local(employee.getZ_local());
			employeesRest.setZ_fechacont(employee.getZ_fechacont());			
			employeesRest.setZ_pos(employee.getZ_pos());
			employeesRest.setZ_fhcierre(employee.getZ_fhcierre());
			employeesRest.setZ_montoinf(employee.getZ_montoinf());	
			employeesRest.setZ_montoirs(employee.getZ_montoirs());
			employeesRest.setZ_estado(employee.getZ_estado());
			
//			employeesRest.setRpl_fecha_graba(employee.getRpl_fecha_graba());
//			employeesRest.setRpl_fecha_actualiza(employee.getRpl_fecha_actualiza());
      			
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}

}
