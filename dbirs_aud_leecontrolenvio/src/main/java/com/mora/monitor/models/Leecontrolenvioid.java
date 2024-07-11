package com.mora.monitor.models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Leecontrolenvioid implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer ace_local;
	private Integer ace_pos;
	private String aep_idcarga;

}
