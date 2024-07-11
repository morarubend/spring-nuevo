package com.rubenmoraapi.modelos;

import java.sql.Date;
import java.sql.Time;
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
public class Monauditoriaapi {
	private Long aud_idregistro;
	private String aud_usuario = "";
	private String aud_sistema = "";
	private String aud_cliente = "";
	private Date aud_fecha;
	private Time aud_hora;
	private String aud_modulo = "";
	private String aud_tiporeg = "";
	private String aud_registro_afectado = "";
	private String aud_valor_inicio = "";
	private String aud_valor_fin = "";
	private String aud_observaciones = "";
}
