package com.mora.monitor.models;

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
@IdClass(Ctxheadertrxid.class)

@Table(name = "CTX_HEADER_TRX")

public class Ctxheadertrx implements Serializable {

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

}
