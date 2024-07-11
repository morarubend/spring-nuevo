package com.rubenmoraapi.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "CTX_DET_ERRTX")

public class Ctxdeterrtx implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
    private Ctxdeterrtxid ctxdeterrtxid;
	
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

}
