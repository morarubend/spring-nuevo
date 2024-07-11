package com.rubenmoraapi.models;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumns;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "CTX_ERRTX")
public class Ctxerrtx implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "TXER_NUMERO")
	private Long txer_numero;
	
	@Column(name = "TXER_ESTADO")
	private Integer txer_estado;
	
	@Column(name = "TXER_FCONTABLE")
	private Date txer_fcontable;
	
	@Column(name = "TXER_FECHA")
	private Date txer_fecha;
	
	@Column(name = "TXER_HORA")
	private Time txer_hora;
	
	@Column(name = "TXER_LOCAL")
	private Integer txer_local;
	
	@Column(name = "TXER_TRX")
	private String txer_trx;

    @ManyToOne(cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "txer_local", insertable = false, updatable = false, referencedColumnName = "loc_numero")
    private Irslocales irslocales;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE) 
    @JoinColumns(value = {
        @JoinColumn(
            name = "txer_numero", insertable = false, updatable = false, referencedColumnName = "txer_numero"),
        @JoinColumn(
            name = "txer_local", insertable = false, updatable = false, referencedColumnName = "txer_local")
    })
    private Ctxdeterrtx ctxdeterrtx;

}
