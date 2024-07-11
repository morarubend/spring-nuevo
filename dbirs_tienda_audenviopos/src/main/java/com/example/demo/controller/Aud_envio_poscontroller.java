package com.example.demo.controller;

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

import com.example.demo.model.Aud_envio_pos;
import com.example.demo.service.Aud_envio_posservice;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class Aud_envio_poscontroller {
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
	private Aud_envio_posservice Aud_envio_posservice;
	
	@RequestMapping(value = "/audenviopos", method = RequestMethod.POST)
	@ResponseBody
	public List<Aud_envio_pos> index(@RequestBody Aud_envio_pos aud_envio_pos) {
		String verip = (aud_envio_pos.getAep_idcarga());
		System.out.println ("Id Carga " + verip);	
		return Aud_envio_posservice.findByClaveThanEqual(aud_envio_pos);	
	}
}
