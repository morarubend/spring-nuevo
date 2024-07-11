package com.forus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.forus.models.ctx_header_trx;
import com.forus.models.ctx_header_trxapi;
import com.forus.services.ctx_header_trxservice;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")

public class ctx_header_trxcontroller {
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
	private ctx_header_trxservice ctxheadertrxservice;
	
	@RequestMapping(value = "/header", method = RequestMethod.POST)
	@ResponseBody
	public List<ctx_header_trxapi> index(@RequestBody ctx_header_trx ctxheadertrx) {

		System.out.println ("El local es " + ctxheadertrx.getHed_local());
		System.out.println ("El numero es " + ctxheadertrx.getHed_numtrx());
		System.out.println ("La  fecha es " + ctxheadertrx.getHed_fechatrx());
		System.out.println ("El documento es " + ctxheadertrx.getHed_numdoc());
		
		List<ctx_header_trx> employees =  ctxheadertrxservice.leerCtxheader(ctxheadertrx);
		List<ctx_header_trxapi> employeesRestList = new ArrayList<ctx_header_trxapi>();
		for (ctx_header_trx employee : employees) {
			ctx_header_trxapi employeesRest = new ctx_header_trxapi();

			employeesRest.setHed_pais(employee.getHed_pais());			
			employeesRest.setHed_origentrx(employee.getHed_origentrx());			
			employeesRest.setHed_local(employee.getHed_local());
			employeesRest.setHed_pos(employee.getHed_pos());
			employeesRest.setHed_numtrx(employee.getHed_numtrx());
			employeesRest.setHed_fechatrx(employee.getHed_fechatrx());
			employeesRest.setHed_horatrx(employee.getHed_horatrx());				
			employeesRest.setHed_numdoc(employee.getHed_numdoc());
			employeesRest.setHed_enviodte(employee.getHed_enviodte());
			employeesRest.setHed_fcontable(employee.getHed_fcontable());
			employeesRest.setHed_cajero(employee.getHed_cajero());
			employeesRest.setHed_tipotrx(employee.getHed_tipotrx());
			employeesRest.setHed_tipodoc(employee.getHed_tipodoc());		
			employeesRest.setHed_rutdoc(employee.getHed_rutdoc());
			employeesRest.setHed_nomclte(employee.getHed_nomclte());
			employeesRest.setHed_dirclte(employee.getHed_dirclte());
			employeesRest.setHed_comuna(employee.getHed_comuna());
			employeesRest.setHed_ciudad(employee.getHed_ciudad());			
			employeesRest.setHed_giro(employee.getHed_giro());
			employeesRest.setHed_total(employee.getHed_total());
			employeesRest.setHed_ciudad(employee.getHed_ciudad());
			employeesRest.setHed_ciudad(employee.getHed_ciudad());
//			employeesRest.setHed_cajero(employee.getIrscajeros().getCaj_nombre());
			employeesRestList.add(employeesRest);
		}
		return employeesRestList;
	}
	
	@RequestMapping(value = "/enviodte", method = RequestMethod.PUT)
	@ResponseBody
	public String updatePos(@RequestBody ctx_header_trx ctxheadertrx) {
		String response = ctxheadertrxservice.updateEnvio(ctxheadertrx);
		return response;
	} 
	
}
