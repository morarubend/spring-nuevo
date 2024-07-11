package com.rubenmoraapi.modelos;

import java.sql.Date;
import java.sql.Time;
//import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Tranapires {
	private Date txer_fecha;
	private Time txer_hora;
	private Integer txer_numero = 0;
	private Integer txer_local = 0;
	private String loc_descripcion = "";
	private String loc_tipo = "";
	private Integer txer_estado = 0;
	private String txer_trx = "";
	private String dete_desc = "";
	private Date txer_fcontable;
}
