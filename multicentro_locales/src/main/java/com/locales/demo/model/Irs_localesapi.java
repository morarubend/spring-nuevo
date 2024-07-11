package com.locales.demo.model;

import lombok.Data;

@Data
public class Irs_localesapi {
	private Long loc_numero;
	private String loc_descripcion = "";
	private String loc_activo = "";	
	private Integer reg_numero = 0;
	private String loc_rut = "";
	private String loc_direccion = "";	
	private String loc_comuna;	
	private String loc_ciudad;
	private Integer loc_region;
}
