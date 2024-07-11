package com.rubenmoraapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.rubenmoraapi.modelos.Ctxerrtx;
import com.rubenmoraapi.modelos.Tranapires;
import com.rubenmoraapi.services.Ctxerrservice;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class Ctxerrcontroller {
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
	private Ctxerrservice ctxerrservice;

	// Get All Users
    // URL: http://localhost:8080/api/transa
    @GetMapping("/transa")
	public List<Tranapires> index() {
		List<Ctxerrtx> employees =  ctxerrservice.findAll();
		List<Tranapires> employeesRestList = new ArrayList<Tranapires>();
		for (Ctxerrtx employee : employees) {
			Tranapires employeesRest = new Tranapires();
			employeesRest.setTxer_fecha(employee.getTxer_fecha());
			employeesRest.setTxer_hora(employee.getTxer_hora());
			employeesRest.setTxer_numero(employee.getTxer_numero());
			employeesRest.setTxer_local(employee.getTxer_local());
			employeesRest.setLoc_descripcion(employee.getIrslocales().getLoc_descripcion());
			employeesRest.setLoc_tipo(employee.getIrslocales().getLoc_tipo());			
			employeesRest.setTxer_estado(employee.getTxer_estado());
			employeesRest.setTxer_trx(employee.getTxer_trx());			
			employeesRest.setDete_desc(employee.getCtxdeterrtx().getDete_desc());
			employeesRest.setTxer_fcontable(employee.getTxer_fcontable());
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}	
    
	@RequestMapping(value = "/estadoupt", method = RequestMethod.PUT)
	@ResponseBody
	public String updatePos(@RequestBody Ctxerrtx ctxerrtxpos) {
		String response = ctxerrservice.updateEstado(ctxerrtxpos);
		return response;
	} 
}
