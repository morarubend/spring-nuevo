package com.rubenmoraapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Irslocalesdto {
	
	private Integer loc_numero = 0;
	private Integer lpo_pos = 0;
	private String lpo_numero;	
	private String lpo_descripcion;
	private String lpo_activo;
	private String lpo_ip;
	private String lpo_usrftp;
	private String lpo_pwdftp;
	private String lpo_bbrpath;

}
