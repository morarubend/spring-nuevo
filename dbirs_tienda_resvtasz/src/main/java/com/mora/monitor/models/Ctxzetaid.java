package com.mora.monitor.models;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ctxzetaid implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer z_pais;
	private Integer z_origentrx;
	private Integer z_sociedad;
	private Integer z_local;
	private Integer z_pos;
	private LocalDate z_fechacont;

}
