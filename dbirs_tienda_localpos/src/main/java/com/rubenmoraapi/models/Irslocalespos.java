package com.rubenmoraapi.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@IdClass(Irslocalesposid.class)

@Table(name = "IRS_LOCALESPOS")

public class Irslocalespos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "LOC_NUMERO")
	private Integer loc_numero;
	
	@Id
	@Column(name = "LPO_POS")
	private Integer lpo_pos;
	
	@Column(name = "LPO_NUMERO")
	private String lpo_numero;
	
	@Column(name = "LPO_DESCRIPCION")
	private String lpo_descripcion;
	
	@Column(name = "LPO_ACTIVO")
	private String lpo_activo;
	
	@Column(name = "LPO_IP")
	private String lpo_ip;
	
	@Column(name = "LPO_USRFTP")
	private String lpo_usrftp;
	
	@Column(name = "LPO_PWDFTP")
	private String lpo_pwdftp;
	
	@Column(name = "LPO_BBRPATH")
	private String lpo_bbrpath;
	
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "loc_numero", insertable = false, updatable = false, referencedColumnName = "loc_numero")
    private Irslocales irslocales;

	@Override
	public String toString() {
		return "Irslocalespos [getLoc_numero()=" + getLoc_numero() + ", getLpo_pos()=" + getLpo_pos()
				+ ", getLpo_numero()=" + getLpo_numero() + ", getLpo_descripcion()=" + getLpo_descripcion()
				+ ", getLpo_activo()=" + getLpo_activo() + ", getLpo_ip()=" + getLpo_ip() + ", getLpo_usrftp()="
				+ getLpo_usrftp() + ", getLpo_pwdftp()=" + getLpo_pwdftp() + ", getLpo_bbrpath()=" + getLpo_bbrpath()
				+ ", getIrslocales()=" + getIrslocales() + "]";
	}

}
