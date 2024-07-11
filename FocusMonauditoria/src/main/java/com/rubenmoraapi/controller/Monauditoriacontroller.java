package com.rubenmoraapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.rubenmoraapi.modelos.Monauditoria;
import com.rubenmoraapi.modelos.Monauditoriaapi;
import com.rubenmoraapi.services.Monauditoriaservice;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class Monauditoriacontroller {
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
	private Monauditoriaservice monauditoriaservice;
	
	@RequestMapping(value = "/auditoria", method = RequestMethod.GET)
	public List<Monauditoriaapi> index() {
		List<Monauditoria> employees =  monauditoriaservice.findAll();
		List<Monauditoriaapi> employeesRestList = new ArrayList<Monauditoriaapi>();
		for (Monauditoria employee : employees) {
			Monauditoriaapi employeesRest = new Monauditoriaapi();
			employeesRest.setAud_idregistro(employee.getAud_idregistro());
			employeesRest.setAud_usuario(employee.getAud_usuario());
			employeesRest.setAud_sistema(employee.getAud_sistema());
			employeesRest.setAud_cliente(employee.getAud_cliente());
			employeesRest.setAud_fecha(employee.getAud_fecha());			
			employeesRest.setAud_hora(employee.getAud_hora());
			employeesRest.setAud_modulo(employee.getAud_modulo());
			employeesRest.setAud_tiporeg(employee.getAud_tiporeg());
			employeesRest.setAud_registro_afectado(employee.getAud_registro_afectado());
			employeesRest.setAud_valor_inicio(employee.getAud_valor_inicio());
			employeesRest.setAud_valor_fin(employee.getAud_valor_fin());
			employeesRest.setAud_observaciones(employee.getAud_observaciones());
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}
	
	@RequestMapping(value = "/auditoriacreaxx", method = RequestMethod.POST)
	@ResponseBody
	public String insertPos(@RequestBody Monauditoria monauditoria) {		
		String response = monauditoriaservice.insertAuditoria(monauditoria);
		return response;			
	}
	
	@PostMapping("/auditoriacrea")
	Monauditoria createOrSaveEmployee(@RequestBody Monauditoria monauditoria) {
		System.out.println(monauditoria);
		return monauditoriaservice.insert(monauditoria);
	}
}
