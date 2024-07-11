package com.rubenmoraapi.modelos;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MON_AUDITORIA")
@SequenceGenerator(
		name="secmonauditoria", 
		sequenceName="SEC_MON_AUDITORIA",
		initialValue = 1, 
		allocationSize = 1)
public class Monauditoria implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="secmonauditoria")
	@Column(name = "AUD_IDREGISTRO")
	private Long aud_idregistro;
		
	@Column(name = "AUD_USUARIO")
	private String aud_usuario;
	
	@Column(name = "AUD_SISTEMA")
	private String aud_sistema;
	
	@Column(name = "AUD_CLIENTE")
	private String aud_cliente;
	
	@JsonFormat(pattern="yyyy-MM-dd")
//	@Column(name = "AUD_FECHA")
	private Date aud_fecha;

	@JsonFormat(pattern="HH:mm:ss")
//	@Column(name = "AUD_HORA")
	private Time aud_hora;
	
	@Column(name = "AUD_MODULO")
	private String aud_modulo;
	
	@Column(name = "AUD_TIPOREG")
	private String aud_tiporeg;
	
	@Column(name = "AUD_REGISTRO_AFECTADO")
	private String aud_registro_afectado;
	
	@Column(name = "AUD_VALOR_INICIO")
	private String aud_valor_inicio;
	
	@Column(name = "AUD_VALOR_FIN")
	private String aud_valor_fin;
	
	@Column(name = "AUD_OBSERVACIONES")
	private String aud_observaciones;
}
