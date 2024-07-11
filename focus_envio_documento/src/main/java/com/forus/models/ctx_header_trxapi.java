package com.forus.models;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ctx_header_trxapi {
	private Integer hed_pais;
	private Integer hed_origentrx;
	private Integer hed_local;
	private Integer hed_pos;
	private Integer hed_numtrx;
	private LocalDate hed_fechatrx;
	private LocalTime hed_horatrx;
//	private String hed_origen;
	private Integer hed_numdoc;
//	private Integer hed_turno;
	private LocalDate hed_fcontable;
	private String hed_cajero;
	private String hed_tipotrx;
//	private String hed_subtipo;
	private String hed_tipodoc;
	private String hed_rutdoc;
	private Integer hed_brutopos;
//	private Integer hed_brutoneg;
//	private Integer hed_donacion;
	private Integer hed_impuesto;
//	private Integer hed_pagdes;
//	private Integer hed_pagtrx;
//	private Integer hed_prodtrx;
	private String hed_nomclte;
	private String hed_dirclte;
	private String hed_comuna;
	private String hed_ciudad;
	private String hed_fono;
	private String hed_giro;
	private String hed_tipotrx_tsl;
	private Integer hed_total;
	private Integer hed_localdest;
	private String hed_nombre_vend;
	private String hed_estadosap;
	private String hed_estadosapst;
//	private Integer hed_numdoc_origen;
//	private Integer hed_local_origen;
//	private Integer hed_pos_origen;
//	private Integer hed_numtrx_origen;
//	private Date hed_fechatrx_origen;
	private LocalDate hed_fechaing;
	private LocalTime hed_horaing;
//	private Time hed_horatrx_origen;
	private String hed_anulado;
//	private Integer num_resumen;
//	private Integer hed_factor;
//	private String hed_promrut;
//	private String hed_promtipo;
	private String hed_codigoted;
	private String hed_enviodte;
	private String hed_usuario1;
	private String hed_usuario2;
	private String hed_usuario3;
}
