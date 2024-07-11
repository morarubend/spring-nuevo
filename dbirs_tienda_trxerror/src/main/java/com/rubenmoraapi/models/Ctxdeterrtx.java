package com.rubenmoraapi.models;

import java.io.Serializable;

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

@IdClass(Ctxdeterrtxid.class)

@Table(name = "CTX_DET_ERRTX")

public class Ctxdeterrtx implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "TXER_NUMERO")
	private Integer txer_numero;
	
	@Id
	@Column(name = "TXER_LOCAL")
	private Integer txer_Local;

	@Column(name = "DETE_COD")
	private Integer dete_cod;
	
	@Column(name = "DETE_STR")
	private Integer dete_str;
	
	@Column(name = "DETE_CAMPO")
	private Integer dete_campo;
	
	@Column(name = "DETE_DESC")
	private String dete_desc;
	
	@Column(name = "DETE_DOMINIO")
	private Integer dete_dominio;
	
	@Column(name = "TXER_ORIGENTRX")
	private Integer txer_origentrx;
	
	@Column(name = "TXER_IDTURNO")
	private Integer txer_idturno;

}
