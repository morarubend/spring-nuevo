package com.forus.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(ctx_header_trxid.class)

@Table(name = "CTX_HEADER_TRX")

public class ctx_header_trx implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "HED_PAIS")
	private Integer hed_pais;
	
	@Id
	@Column(name = "HED_ORIGENTRX")
	private Integer hed_origentrx;
	
	@Id
	@Column(name = "HED_LOCAL")
	private Integer hed_local;
	
	@Id
	@Column(name = "HED_POS")
	private Integer hed_pos;
	
	@Id
	@Column(name = "HED_NUMTRX")
	private Integer hed_numtrx;
	
	@Id
	@Column(name = "HED_FECHATRX")
	private LocalDate hed_fechatrx;
	
	@Id
	@Column(name = "HED_HORATRX")
	private LocalTime hed_horatrx;
		
	@Column(name = "HED_ORIGEN")
	private String hed_origen;
	
	@Column(name = "HED_NUMDOC")
	private Integer hed_numdoc;
	
	@Column(name = "HED_TURNO")
	private Integer hed_turno;
	
	@Column(name = "HED_FCONTABLE")
	private LocalDate hed_fcontable;
	
	@Column(name = "HED_CAJERO")
	private String hed_cajero;

	@Column(name = "HED_TIPOTRX")
	private String hed_tipotrx;
	
	@Column(name = "HED_SUBTIPO")
	private String hed_subtipo;
	
	@Column(name = "HED_TIPODOC")
	private String hed_tipodoc;
	
	@Column(name = "HED_RUTDOC")
	private String hed_rutdoc;
	
	@Column(name = "HED_BRUTOPOS")
	private Integer hed_brutopos;
	
	@Column(name = "HED_BRUTONEG")
	private Integer hed_brutoneg;
	
	@Column(name = "HED_DONACION")
	private Integer hed_donacion;
	
	@Column(name = "HED_IMPUESTO")
	private Integer hed_impuesto;
	
	@Column(name = "HED_PAGDES")
	private Integer hed_pagdes;
	
	@Column(name = "HED_PAGTRX")
	private Integer hed_pagtrx;
	
	@Column(name = "HED_PRODTRX")
	private Integer hed_prodtrx;
	
	@Column(name = "HED_NOMCLTE")
	private String hed_nomclte;
	
	@Column(name = "HED_DIRCLTE")
	private String hed_dirclte;
	
	@Column(name = "HED_COMUNA")
	private String hed_comuna;
	
	@Column(name = "HED_CIUDAD")
	private String hed_ciudad;
	
	@Column(name = "HED_FONO")
	private String hed_fono;
	
	@Column(name = "HED_GIRO")
	private String hed_giro;
	
	@Column(name = "HED_TIPOTRX_TSL")
	private String hed_tipotrx_tsl;
	
	@Column(name = "HED_TOTAL")
	private Integer hed_total;
	
	@Column(name = "HED_LOCALDEST")
	private Integer hed_localdest;
	
	@Column(name = "HED_NOMBRE_VEND")
	private String hed_nombre_vend;
	
	@Column(name = "HED_ESTADOSAP")
	private String hed_estadosap;
	
	@Column(name = "HED_ESTADOSAPST")
	private String hed_estadosapst;
	
	@Column(name = "HED_NUMDOC_ORIGEN")
	private Integer hed_numdoc_origen;
	
	@Column(name = "HED_LOCAL_ORIGEN")
	private Integer hed_local_origen;
	
	@Column(name = "HED_POS_ORIGEN")
	private Integer hed_pos_origen;
	
	@Column(name = "HED_NUMTRX_ORIGEN")
	private Integer hed_numtrx_origen;
	
	@Column(name = "HED_FECHATRX_ORIGEN")
	private LocalDate hed_fechatrx_origen;
	
	@Column(name = "HED_FECHAING")
	private LocalDate hed_fechaing;
	
	@Column(name = "HED_HORAING")
	private LocalTime hed_horaing;
	
	@Column(name = "HED_HORATRX_ORIGEN")
	private LocalTime hed_horatrx_origen;
	
	@Column(name = "HED_ANULADO")
	private String hed_anulado;
	
	@Column(name = "NUM_RESUMEN")
	private Integer num_resumen;
	
	@Column(name = "HED_FACTOR")
	private Integer hed_factor;
	
	@Column(name = "HED_PROMRUT")
	private String hed_promrut;
	
	@Column(name = "HED_PROMTIPO")
	private String hed_promtipo;
	
	@Column(name = "HED_CODIGOTED")
	private String hed_codigoted;
	
	@Column(name = "HED_ENVIODTE")
	private String hed_enviodte;
	
	@Column(name = "HED_USUARIO1")
	private String hed_usuario1;
	
	@Column(name = "HED_USUARIO2")
	private String hed_usuario2;
	
	@Column(name = "HED_USUARIO3")
	private String hed_usuario3;
}
