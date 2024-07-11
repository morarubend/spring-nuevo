package com.mora.monitor.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Leecontrolenviodto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String ace_local;	
	private String ace_pos;
	private String aep_idcarga;
	private String ace_estado;
	private String ace_fconsulta;
	private String ace_fgraba;

}
