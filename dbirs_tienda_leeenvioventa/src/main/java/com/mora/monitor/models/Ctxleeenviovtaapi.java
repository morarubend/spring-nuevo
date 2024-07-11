package com.mora.monitor.models;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ctxleeenviovtaapi {
	private Integer hed_pais;
	private Integer hed_origentrx;
	private Integer hed_local;
	private Integer hed_pos;
	private Integer hed_numtrx;
	private LocalDate hed_fechatrx;
	private LocalTime hed_horatrx;
	private String env_idtrx;	
	private String env_estado;
	private String env_data;
	private String env_response;
	private Integer hed_numdoc;
}
