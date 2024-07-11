package com.mora.monitor.controller;

import java.time.LocalDate;
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

import com.mora.monitor.dto.Leecontrolenviodto;
import com.mora.monitor.models.Leecontrolenvioapi;
import com.mora.monitor.service.Leecontrolenvioservice;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class Leecontrolenviocontroller {
	
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
	private Leecontrolenvioservice leecontrolenvioservice;
	
	@RequestMapping(value = "/controlenvio", method = RequestMethod.POST)
	@ResponseBody
	public List<Leecontrolenviodto> index(@RequestBody Leecontrolenvioapi leecontrolenviopos) {
		String verestado = (leecontrolenviopos.getAce_estadot());
		LocalDate verdesde = (leecontrolenviopos.getAce_fdesde());
		LocalDate verhasta = (leecontrolenviopos.getAce_fhasta());
		System.out.println ("Estado " + verestado);
		System.out.println ("Desde " + verdesde);
		System.out.println ("Hasta " + verhasta);	
		return leecontrolenvioservice.findByClaveThanEqual(leecontrolenviopos);	
	}
}
