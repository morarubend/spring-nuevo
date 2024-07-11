package com.mora.monitor.models;

import java.io.Serializable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ctxenviovtaid implements Serializable{

	private static final long serialVersionUID = 1L;
		
	private Integer hed_pais;	
	private Integer hed_origentrx;
	private Integer hed_local;
	private Integer hed_pos;	
	private Integer hed_numtrx;	
	private LocalDateTime hed_fechatrx;
	private LocalDateTime hed_horatrx;

}
