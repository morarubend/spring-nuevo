package com.mora.monitor.models;

import java.io.Serializable;
import java.time.LocalDate;

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
@Table(name = "IRS_PRODUCTOS")

public class irs_productos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Id
	@Column(name = "PRD_CODIGO")
	private String prd_codigo;

	@Column(name = "PRD_ACTIVO")
	private String prd_activo;
	
	@Column(name = "PRD_DESCR")
	private String prd_descr;
	
	@Column(name = "PRD_DESCRPOS")
	private String prd_descrpos;
	
	@Column(name = "PRD_UNIDADCOMP")
	private Integer prd_unidadcomp;
	
	@Column(name = "PRD_UNIDADPALLET")
	private Integer prd_unidadpallet;
	
	@Column(name = "PRD_ALTURAPALLET")
	private Float prd_alturapallet;
	
	@Column(name = "PRD_PRVENTA")
	private Float prd_prventa;
	
	@Column(name = "PRD_PRCOMPRA")
	private Float prd_prcompra;
	
	@Column(name = "PRD_UNIDADREPOSTD")
	private Integer prd_unidadrepostd;
	
	@Column(name = "PRD_UNIDADMINSTD")
	private Integer prd_unidadminstd;
	
	@Column(name = "PRD_PROVPRINCIPAL")
	private String prd_provprincipal;

	@Column(name = "PRD_MODIFICABLE")
	private String prd_modificable;
	
	@Column(name = "PRD_TIPOPOS")
	private String prd_tipopos;
	
	@Column(name = "PRD_CLASS")
	private String prd_class;
	
	@Column(name = "PRD_TIPOPED")
	private String prd_tipoped;

	@Column(name = "PRD_TIPOVENTA")
	private String prd_tipoventa;
	
	@Column(name = "PRD_IMPUESTO")
	private String prd_impuesto;
	
	@Column(name = "PRD_TIPOCOMB")
	private String prd_tipocomb;
	
	@Column(name = "PRD_PADRECOMB")
	private String prd_padrecomb;

	@Column(name = "PRD_TIPOCUADRATURA")
	private String prd_tipocuadratura;
	
	@Column(name = "PRD_INVFISICO")
	private String prd_invfisico;
	
	@Column(name = "PRD_APLICARA")
	private String prd_aplicara;
	
	@Column(name = "PRD_UNIDADCAJA")
	private Integer prd_unidadcaja;
	
	@Column(name = "PRD_CODPADRE")
	private String prd_codpadre;
	
	@Column(name = "PRD_CLASE")
	private String prd_clase;
	
	@Column(name = "PRD_FACTIVACION")
	private LocalDate prd_factivacion;
	
	@Column(name = "PRD_UNIDADMED")
	private Integer prd_unidadmed;
	
	@Column(name = "PRD_GCOMPRASAP")
	private String prd_gcomprasap;
	
	@Column(name = "CAT_CODIGO")
	private String cat_codigo;
	
	@Column(name = "CLA_CODIGO")
	private String cla_codigo;
	
	@Column(name = "TPR_TIPOPROD")
	private Integer tpr_tipoprod;
	
	@Column(name = "PRD_GLOSAUNIDADREPO")
	private String prd_glosaunidadrepo;
	
	@Column(name = "PRD_TIPO")
	private String prd_tipo;
	
	@Column(name = "PRD_GLOSAUNIDADCONTEO")
	private String prd_glosaunidadconteo;
	
	@Column(name = "PRD_SERV")
	private String prd_serv;
	
	@Column(name = "PRD_SETVENTA")
	private String prd_setventa;
	
	@Column(name = "RUB_CODIGO")
	private String rub_codigo;
	
	@Column(name = "PRD_TALLA")
	private String prd_talla;
	
	@Column(name = "PRD_FACTORUMED")
	private Float prd_factorumed;
		
	@Column(name = "PRD_COLOR")
	private String prd_color;
	
	@Column(name = "PRD_DESPACHO")
	private String prd_despacho;
	
	@Column(name = "RUB_GARANTIA")
	private String prd_garantia;
	
	@Column(name = "PRD_MARCA")
	private String prd_marca;
	
	@Column(name = "PRD_DISPO01")
	private String prd_disp01;
	
	@Column(name = "PRD_DISPO02")
	private String prd_disp02;
	
	@Column(name = "PRD_DISPO03")
	private String prd_disp03;
	
	@Column(name = "PRD_DISPO04")
	private String prd_disp04;
	
	@Column(name = "PRD_DISPO05")
	private String prd_disp05;
	
	@Column(name = "PRD_DISPO06")
	private String prd_disp06;
	
	@Column(name = "PRD_DISPO07")
	private String prd_disp07;
	
	@Column(name = "PRD_DISPO08")
	private String prd_disp08;
	
	@Column(name = "PRD_DISPO09")
	private String prd_disp09;
	
	@Column(name = "PRD_DISPO010")
	private String prd_disp010;
	
	@Column(name = "CAT_CODIGO_GAR")
	private String cat_codigo_gar;
	
	@Column(name = "RUB_RUTSTORAGE")
	private String prd_rutstorage;
	
	@Column(name = "PRD_SIN_IVA")
	private String prd_sin_iva;
	
	@Column(name = "PRD_VENDIBLE")
	private String prd_vendible;
		
	@Column(name = "PRD_DISPO11")
	private String prd_disp11;
	
	@Column(name = "PRD_DISPO12")
	private String prd_disp12;
	
	@Column(name = "PRD_DISPO13")
	private String prd_disp33;
	
	@Column(name = "PRD_DISPO14")
	private String prd_disp14;
	
	@Column(name = "PRD_DISPO15")
	private String prd_disp15;
	
	@Column(name = "PRD_DISPO16")
	private String prd_disp16;
	
	@Column(name = "PRD_DISPO17")
	private String prd_disp17;
	
	@Column(name = "PRD_DISPO18")
	private String prd_disp18;
	
	@Column(name = "PRD_MODELO")
	private String prd_modelo;
	
}
