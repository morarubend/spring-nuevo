package com.mora.monitor.models;

import java.sql.Date;
import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ctxheadertrxapi {
	private Integer hed_pais;
	private Integer hed_origentrx;
	private Integer hed_local;
	private Integer hed_pos;
	private Integer hed_numtrx;
	private Date hed_fechatrx;
	private Time hed_horatrx;
	private Integer hed_numdoc;
}
