package com.rubenmoraapi.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "IRS_LOCALIDADES")
public class Irslocalidades implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Id
	@Column(name = "LCA_NUMERO")
	private Integer lca_numero;
	
    @Column(name = "LCA_DESCRIPCION")
    private String lca_descripcion;
    
	@Column(name = "COM_NUMERO")
	private Integer com_numero;

}
