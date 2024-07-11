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

import com.mora.monitor.models.Ctx_zeta;
import com.mora.monitor.models.Ctx_zetaapi;
import com.mora.monitor.services.Ctx_zetaservice;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class Ctx_zetacontroller {
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
	private Ctx_zetaservice ctx_zetaservice;
	
	@RequestMapping(value = "/getzeta", method = RequestMethod.POST)
	@ResponseBody
	public List<Ctx_zetaapi> index(@RequestBody Ctx_zeta ctx_zetapos) {
		List<Ctx_zeta> employees =  ctx_zetaservice.findByClaveThanEqual(ctx_zetapos);
		List<Ctx_zetaapi> employeesRestList = new ArrayList<Ctx_zetaapi>();
		for (Ctx_zeta employee : employees) {
			Ctx_zetaapi employeesRest = new Ctx_zetaapi();
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
