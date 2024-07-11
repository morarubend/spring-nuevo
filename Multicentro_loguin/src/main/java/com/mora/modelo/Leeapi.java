package com.mora.modelo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Leeapi implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String clave;
	private String resultado;

}
