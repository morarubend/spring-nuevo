package com.locales.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "IRS_LOCALES")

public class Irs_locales implements Serializable {


	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Id
	@Column(name = "LOC_NUMERO")
	private Long loc_numero;
	
    @Column(name = "LOC_DESCRIPCION")
    private String loc_descripcion;

	@Column(name = "LOC_TIPO")
	private String  loc_tipo;
	
	@Column(name = "LOC_ACTIVO")
	private String  loc_activo;

	@Column(name = "REG_NUMERO")
	private Integer  reg_numero;
	
	@Column(name = "CAD_NUMERO")
	private Integer  cad_numero;
	
	@Column(name = "LOC_PORCBASE")
	private Integer  loc_porcbase;
	
	@Column(name = "LOC_TIPOCUA")
	private String  loc_tipocua;
	
	@Column(name = "LOC_RUT")
	private String  loc_rut;
	
	@Column(name = "LOC_CENTROCOSTO")
	private String  loc_centrocosto;
	
	@Column(name = "LOC_CODCOMERCIO2")
	private Integer  loc_codcomercio2;
	
	@Column(name = "LOC_SOCIEDAD")
	private String  loc_sociedad;
	
	@Column(name = "LOC_DIVISION")
	private String  loc_division;
	
	@Column(name = "LOC_TIPOCAMBIO")
	private Integer  loc_tipocambio;
	
	@Column(name = "MON_CODIGO")
	private String  mon_codigo;
	
	@Column(name = "LOC_MONEDABASE")
	private Integer  loc_monedabase;
	
	@Column(name = "LOC_DEPOSITO")
	private String  loc_deposito;
	
	@Column(name = "LOC_IP2")
	private String  loc_ip2;
	
	@Column(name = "LOC_IP")
	private String  loc_ip;
	
	@Column(name = "LOC_DIRECCION")
	private String  loc_direccion;
	
	@Column(name = "LOC_COMUNA")
	private String  loc_comuna;
	
	@Column(name = "LOC_CIUDAD")
	private String  loc_ciudad;
	
	@Column(name = "LOC_DESCORTA")
	private String  loc_descorta;
	
	@Column(name = "LOC_CPRECIO")
	private String  loc_cprecio;
	
	@Column(name = "LOC_STKBATCH")
	private String  loc_stkbatch;
	
	@Column(name = "LOC_APLICADTE")
	private String  loc_aplicadte;
}
