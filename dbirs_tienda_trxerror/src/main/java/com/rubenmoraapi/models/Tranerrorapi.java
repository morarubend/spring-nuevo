package com.rubenmoraapi.models;

import java.sql.Date;
import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Tranerrorapi {
	
	private Long txer_numero;
	private Integer txer_local = 0;
	private Date txer_fecha;
	private Date txer_fcontable;
	private Time txer_hora;	
	private String  loc_descripcion = "";	
	private String  dete_desc = "";
	private String  txer_trx = "";
	private Integer txer_estado;

}
