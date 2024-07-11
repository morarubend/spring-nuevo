package com.rubenmoraapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rubenmoraapi.models.Ctxerrtx;
import com.rubenmoraapi.models.Tranerrorapi;
import com.rubenmoraapi.services.Ctxerrtxservice;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class Ctxerrtxcontroller {
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
	private Ctxerrtxservice transaService;

/*
    @GetMapping("/transa")   
	public List<Ctxerrtx> index() {
		return transaService.findAll();
	}
*/    
       
	@RequestMapping(value = "/transa", method = RequestMethod.GET)
	public List<Tranerrorapi> index() {
		List<Ctxerrtx> employees =  transaService.findAll();
		List<Tranerrorapi> employeesRestList = new ArrayList<Tranerrorapi>();
		for (Ctxerrtx employee : employees) {
			Tranerrorapi employeesRest = new Tranerrorapi();
			employeesRest.setTxer_numero(employee.getTxer_numero());
			employeesRest.setTxer_local(employee.getTxer_local());
			employeesRest.setTxer_fecha(employee.getTxer_fecha());
			employeesRest.setTxer_fcontable(employee.getTxer_fcontable());
			employeesRest.setTxer_hora(employee.getTxer_hora());
			
			
//			System.out.println ("El local es " + employee.getTxer_local());
//			System.out.println ("El nombre es " + employee.getIrslocales());
		
			if (employee.getIrslocales() != null) {
			    employeesRest.setLoc_descripcion(employee.getIrslocales().getLoc_descripcion());
			}
			
			if (employee.getCtxdeterrtx() != null) {
				employeesRest.setDete_desc(employee.getCtxdeterrtx().getDete_desc());
			}
			
			employeesRest.setTxer_trx(employee.getTxer_trx());
			employeesRest.setTxer_estado(employee.getTxer_estado());
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}	
	
	@RequestMapping(value = "/estadoupt", method = RequestMethod.PUT)
	@ResponseBody
	public String updatePos(@RequestBody Ctxerrtx ctxerrtxpos) {
		String response = transaService.updateEstado(ctxerrtxpos);
		return response;
	}  
	
	@RequestMapping(value = "/estadouptlote", method = RequestMethod.PUT)
	@ResponseBody
	public String updatePoslote(@RequestBody Ctxerrtx ctxerrtxpos) {
		String response = transaService.updateEstado(ctxerrtxpos);
		return response;
	} 
	
	@RequestMapping(value = "/txertrxupt", method = RequestMethod.PUT)
	@ResponseBody
	public String updateTxertrx(@RequestBody Ctxerrtx ctxerrtxpos) {
		String response = transaService.updateTxertrx(ctxerrtxpos);
		return response;
	}
	
	@RequestMapping(value = "/txertrxdel", method = RequestMethod.PUT)
	@ResponseBody
	public String deleteTxertrx(@RequestBody Ctxerrtx ctxerrtxpos) {
		String response = transaService.deleteTxertrx(ctxerrtxpos);
		return response;
	} 
	
    @PutMapping("/{id}")
    public ResponseEntity<Ctxerrtx> updateCar(@PathVariable("id") Long id, @RequestBody Ctxerrtx ctxerrtx) {
            return new ResponseEntity<>(transaService.saveCar(ctxerrtx), HttpStatus.ACCEPTED);
    }
}
