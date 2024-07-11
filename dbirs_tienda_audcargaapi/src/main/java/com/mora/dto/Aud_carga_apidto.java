package com.mora.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Aud_carga_apidto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String aud_idcarga;
    private String aud_estado;
	private String aud_registros;
    private String aud_data;
	private String aud_fprocesa;
	private String aud_fgraba;
    private String aud_colamq;
    private String aud_observaciones;

}
