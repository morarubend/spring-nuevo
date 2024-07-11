package com.mora.monitor.controller;

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

import com.mora.monitor.dto.Ctx_productos_trxdto;
import com.mora.monitor.models.Ctx_productos_trx;
import com.mora.monitor.services.Ctx_productos_trxservice;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class Ctx_productos_trxcontroller {

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
	private Ctx_productos_trxservice ctx_productos_trxservice;
	
	// Get All Notes
/*	
	@RequestMapping(value = "/getproductos")
	public List<Ctx_productos_trx> getTodo() {
	  return ctx_productos_trxservice.findAll();
	}
*/
/*
	@RequestMapping(value = "/getproductos", method = RequestMethod.POST)
	@ResponseBody
	public List<ICtx_productos_trx> index(@RequestBody Ctx_productos_trx ctx_productos_trxpos) {
	return ctx_productos_trxservice.findByClaveThanEqual(ctx_productos_trxpos);
	}
*/	
	@RequestMapping(value = "/getproductos", method = RequestMethod.POST)
	@ResponseBody
	public List<Ctx_productos_trxdto> index(@RequestBody Ctx_productos_trx ctx_productos_trxpos) {
	return ctx_productos_trxservice.findProductosdto(ctx_productos_trxpos);
	}
	
/*
	@RequestMapping(value = "/getproductos", method = RequestMethod.POST)
	@ResponseBody
	public List<Ctx_productos_trxapi> index(@RequestBody Ctx_productos_trx ctx_productos_trxpos) {
		List<Ctx_productos_trx> employees =  ctx_productos_trxservice.findByClaveThanEqual(ctx_productos_trxpos);
		List<Ctx_productos_trxapi> employeesRestList = new ArrayList<Ctx_productos_trxapi>();
		for (Ctx_productos_trx employee : employees) {
			Ctx_productos_trxapi employeesRest = new Ctx_productos_trxapi();
			employeesRest.setPtr_fcontable(employee.getPtr_fcontable());
			employeesRest.setHed_local(employee.getHed_local());			
			employeesRest.setPtr_codprod(employee.getPtr_codprod());
			employeesRest.setPtr_brutopos(employee.getPtr_brutopos());
			
			employeesRest.setHed_numtrx(employee.getHed_numtrx());	
			employeesRest.setHed_fechatrx(employee.getHed_fechatrx());
			employeesRest.setHed_horatrx(employee.getHed_horatrx());
			employeesRest.setEnv_idtrx(employee.getEnv_idtrx());			
			employeesRest.setEnv_estado(employee.getEnv_estado());			
			employeesRest.setEnv_data(employee.getEnv_data());			
			employeesRest.setEnv_response(employee.getEnv_response());    			
			employeesRestList.add(employeesRest);			
		}
		return employeesRestList;
	}
*/	

}
