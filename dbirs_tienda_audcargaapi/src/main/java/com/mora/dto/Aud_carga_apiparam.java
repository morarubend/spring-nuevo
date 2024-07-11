package com.mora.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Aud_carga_apiparam {
	private String aud_estado;
	private LocalDate aud_fdesde;
	private LocalDate aud_fhasta;
	private String aud_idcarga;
}
