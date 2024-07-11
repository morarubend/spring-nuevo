package com.mora.monitor.models;

import java.io.Serializable;
import java.sql.Timestamp;
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
@IdClass(Ctxzetaid.class)

@Table(name = "CTX_ZETA")

public class Ctxzeta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "Z_PAIS")
	private Integer z_pais;
	
	@Id
	@Column(name = "Z_ORIGENTRX")
	private Integer z_origentrx;
	
	@Id
	@Column(name = "Z_SOCIEDAD")
	private Integer z_sociedad;
	
	@Id
	@Column(name = "Z_LOCAL")
	private Integer z_local;
	
	@Id
	@Column(name = "Z_POS")
	private Integer z_pos;
	
	@Id
	@Column(name = "Z_FECHACONT")
	private LocalDate z_fechacont;
	
	@Column(name = "Z_FHCIERRE")
	private LocalTime z_fhcierre;
	
	@Column(name = "Z_CANTTRXINF")
	private Integer z_canttrxinf;
	
	@Column(name = "Z_CANTTRXIRS")
	private Integer z_canttrxirs;
	
	@Column(name = "Z_MONTOINF")
	private Float z_montoinf;
	
	@Column(name = "Z_MONTOIRS")
	private Float z_montoirs;
	
	@Column(name = "Z_ESTADO")
	private String z_estado;
	
	@Column(name = "RPL_FECHA_GRABA")
	private LocalDate rpl_fecha_graba;
	
	@Column(name = "RPL_FECHA_ACTUALIZA")
	private Timestamp rpl_fecha_actualiza;
	
	@Column(name = "Z_CAJERO")
	private String z_cajero;
}
