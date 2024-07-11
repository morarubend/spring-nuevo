package com.mora.monitor.models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Controlenvioapi {

	private Integer ace_local;
	private Integer ace_pos;
	private String aep_idcarga;
	private String ace_estado;
	private LocalDateTime ace_fconsulta;
	private LocalDateTime ace_fgraba;
	private String aep_data;

}
