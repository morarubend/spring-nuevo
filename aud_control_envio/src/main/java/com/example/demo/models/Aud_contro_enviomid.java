package com.example.demo.models;

import java.io.Serializable;

import lombok.Data;

@Data

public class Aud_contro_enviomid implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer ace_local;
	private Integer ace_pos;
	private String aep_idcarga;

}
