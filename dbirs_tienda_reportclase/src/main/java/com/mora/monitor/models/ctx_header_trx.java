package com.mora.monitor.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;

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
	
	@Column(name = "HED_SOCIEDAD")
	private Integer hed_sociedad;
	
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
	
	@Column(name = "HED_SUBTIPO2")
	private String hed_subtipo2;
	
	@Column(name = "HED_TIPODOC")
	private String hed_tipodoc;
	
	@Column(name = "HED_RUTDOC")
	private String hed_rutdoc;
	
	@Column(name = "HED_BRUTOPOS")
	private Float hed_brutopos;
	
	@Column(name = "HED_BRUTONEG")
	private Float hed_brutoneg;
	
	@Column(name = "HED_DONACION")
	private Float hed_donacion;
	
	@Column(name = "HED_IMPUESTO")
	private String hed_impuesto;
	
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
	
	@Column(name = "HED_FONO")
	private String hed_fono;
	
	@Column(name = "HED_GIRO")
	private String hed_giro;
	
	@Column(name = "HED_TIPOTRX_TSL")
	private String hed_tipotrx_tsl;
	
	@Column(name = "HED_TOTAL")
	private Float hed_total;
	
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
	
	@Column(name = "HED_HORATRX_ORIGEN")
	private LocalTime hed_horatrx_origen;
	
	@Column(name = "HED_FECHAING")
	private LocalDate hed_fechaing;
	
	@Column(name = "HED_HORAING")
	private LocalTime hed_horaing;
		
	@Column(name = "HED_ANULADO")
	private String hed_anulado;
	
	@Column(name = "HED_FACTOR")
	private Integer hed_factor;
	
	@Column(name = "HED_REDONDEO")
	private Float hed_redondeo;
	
	@Column(name = "HED_TIPOCAMBIO")
	private Float hed_tipocambio;
	
	@Column(name = "HED_MTOCOPAGO")
	private Float hed_mtocopago;
	
	@Column(name = "HED_PORCOPAGO")
	private Float hed_porcopago;
	
	@Column(name = "HED_CONVENIO")
	private Integer hed_convenio;
		
	@Column(name = "HED_USUARIO")
	private String hed_usuario;
	
	@Column(name = "HED_FHCREACION")
	private LocalDate hed_fhcreacion;
	
	@Column(name = "HED_DESTCOMP")
	private String hed_destcomp;
	
	@Column(name = "HED_TIPOCOMPROB")
	private String hed_tipocomprob;
	
	@Column(name = "HED_NUMCOMPROB")
	private Integer hed_numcomprob;
	
	@Column(name = "HED_USUARIO1")
	private Integer hed_usuario1;
	
	@Column(name = "HED_USUARIO2")
	private Integer hed_usuario2;
		
	@Column(name = "HED_USUARIO3")
	private String hed_usuario3;
	
	@Column(name = "HED_USUARIO4")
	private String hed_usuario4;
	
	@Column(name = "HED_CODTITULAR")
	private String hed_codtitular;
	
	@Column(name = "HED_SECTITULAR")
	private String hed_sectitular;
	
	@Column(name = "HED_NOMTITULAR")
	private String hed_nomtitular;
	
	@Column(name = "HED_NROSOLIC")
	private String hed_nrosolic;
	
	@Column(name = "HED_ORDENCSOLIC")
	private String hed_ordencsolic;
	
	@Column(name = "HED_CODCIE")
	private String hed_codcie;
		
	@Column(name = "HED_MTOCREDITO")
	private Float hed_mtocredito;
		
	@Column(name = "RPL_FECHA_GRABA")
	private LocalDate rpl_fecha_graba;
	
	@Column(name = "RPL_FECHA_ACTUALIZA")
	private LocalDate rpl_fecha_actualiza;
		
	@Column(name = "HED_POS_ANULA")
	private Integer hed_pos_anula;
	
	@Column(name = "HED_CAJERO_ANULA")
	private String hed_cajero_anula;
	
	@Column(name = "HED_TURNO_ANULA")
	private Integer hed_turno_anula;
	
	
	
	@Column(name = "HED_FH_ANULA")
	private LocalDate hed_fh_anula;
	
	@Column(name = "HED_IDTRX")
	private String hed_idtrx;
	
	@Column(name = "HED_SUMINISTRO")
	private String hed_suministro;
	
	@Column(name = "HED_VENDEDOR")
	private String hed_vendedor;
	
	@Column(name = "HED_CODIGOTED")
	private String hed_codigoted;
	
	@Column(name = "HED_SUPERVISOR")
	private String hed_supervisor;
		
	@Column(name = "HED_MONTONETO")
	private Float hed_montoneto;
	
	@Column(name = "HED_MONTOEXENTO")
	private Float hed_montoexento;
	
	@Column(name = "HED_IDTURNO")
	private Integer hed_idturno;
	
	@Column(name = "HED_STOCK")
	private String hed_stock;
	
	@Column(name = "HED_ESTADOSAPVTA")
	private String hed_estadosapvta;
	
	
	
	@Column(name = "HED_MONTOCAPITAL")
	private Float hed_montocapital;
	
	@Column(name = "HED_MONTOREAJUSTE")
	private Float hed_montoreajuste;
	
	@Column(name = "HED_MONTOINTERES")
	private Float hed_montointeres;
	
	@Column(name = "HED_MONTOMULTA")
	private Float hed_montomulta;
	
	@Column(name = "HED_MONTOHONORARIO")
	private Float hed_montohonorario;
	
	@Column(name = "HED_mailclte")
	private String hed_mailclte;
	
	@Column(name = "HED_EXTRACTORVTA")
	private Integer hed_extractorvta;
	
	@Column(name = "HED_REGION")
	private Integer hed_region;
	
	@Column(name = "HED_COMUNA")
	private Integer hed_comuna;
	
	@Column(name = "HED_CIUDAD")
	private Integer hed_ciudad;
	
	@Column(name = "HED_TRX")
	private String hed_trx;
	
}
