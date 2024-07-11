package com.mora.monitor.models;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ctx_zetaapi {
//	private Integer z_pais;
//	private Integer z_origentrx;
//	private Integer z_sociedad;
	private Integer z_local;
	private LocalDate z_fechacont;
	private Integer z_pos;
	private LocalTime z_fhcierre;
//	private Integer z_canttrxinf;
//	private Integer z_canttrxirs;
	private Integer z_montoinf;
	private Integer z_montoirs;
	private String z_estado;
//	private LocalDate rpl_fecha_graba;
//	private Timestamp rpl_fecha_actualiza;
//	private String z_cajero;
}
