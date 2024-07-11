package com.mora.controller;

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

import com.mora.dto.Aud_carga_apidto;
import com.mora.dto.Aud_carga_apiparam;
import com.mora.models.Aud_carga_api;
import com.mora.services.Aud_carga_apiservice;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class Aud_carga_apicontroller {
	
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
	private Aud_carga_apiservice aud_carga_apiservice;
	
	@RequestMapping(value = "/cargaaud", method = RequestMethod.POST)
	@ResponseBody
	public List<Aud_carga_apidto> index(@RequestBody Aud_carga_apiparam aud_carga_apiparam) {
		String estado = (aud_carga_apiparam.getAud_estado());
		LocalDate verdesde = (aud_carga_apiparam.getAud_fdesde());
		LocalDate verhasta = (aud_carga_apiparam.getAud_fhasta());
		System.out.println ("Estado " + estado);
		System.out.println ("Desde " + verdesde);
		System.out.println ("Hasta " + verhasta);	
		return aud_carga_apiservice.findByClaveThanEqual(aud_carga_apiparam);	
	}
	
	@RequestMapping(value = "/estadoupt", method = RequestMethod.PUT)
	@ResponseBody
	public String updatePos(@RequestBody Aud_carga_apiparam audcargaapipos) {
		String response = aud_carga_apiservice.updateEstado(audcargaapipos);
		return response;
	}  

}
