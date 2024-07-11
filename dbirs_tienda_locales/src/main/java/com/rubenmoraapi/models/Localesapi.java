package com.rubenmoraapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Localesapi {
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
