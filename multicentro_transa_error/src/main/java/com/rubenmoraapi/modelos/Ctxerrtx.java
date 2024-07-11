package com.rubenmoraapi.modelos;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(Ctxerrtxid.class)
@Table(name = "CTX_ERRTX")
public class Ctxerrtx implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "TXER_NUMERO")
	private Integer txer_numero;
	
	@Id
	@Column(name = "TXER_LOCAL")
	private Integer txer_local;
	
//	@Temporal(value=TemporalType.DATE)
	@Column(name = "TXER_FECHA")
	private Date txer_fecha;
	
//	@Temporal(value=TemporalType.TIME)
	@Column(name = "TXER_HORA")
	private Time txer_hora;
	
	@Column(name = "TXER_TRX")
	private String txer_trx;

	@Column(name = "TXER_ESTADO")
	private Integer txer_estado;
	
	@Column(name = "TXER_FCONTABLE")
	private Date  txer_fcontable;
	
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "txer_local", insertable = false, updatable = false, referencedColumnName = "loc_numero")
    private Irslocales irslocales;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns(value = {
        @JoinColumn(
            name = "txer_numero", referencedColumnName = "txer_numero", insertable = false, updatable = false),
        @JoinColumn(
            name = "txer_local", referencedColumnName = "txer_local", insertable = false, updatable = false)
    })
    private Ctxdeterrtx Ctxdeterrtx;

}
