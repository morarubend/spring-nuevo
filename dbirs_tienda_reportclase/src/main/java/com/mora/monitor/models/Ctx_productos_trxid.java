package com.mora.monitor.models;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ctx_productos_trxid implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer hed_pais;
	private Integer hed_origentrx;
	private Integer hed_local;
	private Integer hed_pos;
	private Integer hed_numtrx;
	private LocalDate hed_fechatrx;
	private LocalTime hed_horatrx;
	private Integer ptr_corrprod;
	private String ptr_codprod;
}
