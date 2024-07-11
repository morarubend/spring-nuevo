package com.mora.monitor.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(ctx_clientes_trxid.class)

@Table(name = "CTX_PRODUCTOS_TRX")

public class ctx_clientes_trx implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "HED_PAIS")
	private Integer hed_pais;
	
	@Id
	@Column(name = "HED_ORIGENTRX")
	private Integer hed_origentrx;
	
	@Id
	@Column(name = "HED_LOCAL")
	private Integer hed_local;
	
	@Id
	@Column(name = "HED_POS")
	private Integer hed_pos;
	
	@Id
	@Column(name = "HED_NUMTRX")
	private Integer hed_numtrx;
	
	@Id
	@Column(name = "HED_FECHATRX")
	private LocalDate hed_fechatrx;

	@Id
	@Column(name = "HED_HORATRX")
	private LocalTime hed_horatrx;
	
	@Column(name = "CLI_RUT")
	private String cli_rut;
	
	@Column(name = "CLI_CHILENO")
	private String cli_chileno;
	
	@Column(name = "CLI_NUEVO")
	private String cli_nuevo;
	
	@Column(name = "CLI_MAIL")
	private String cli_mail;
	
	@Column(name = "CLI_TELEFONO")
	private String cli_telefono;
	
	@Column(name = "CLI_NOMBRE")
	private String cli_nombre;
	
	@Column(name = "CLI_SEGUNDO_NOMBRE")
	private String cli_segundo_nombre;
	
	@Column(name = "CLI_APELLIDO_PATERNO")
	private String cli_apellido_paterno;
	
	@Column(name = "CLI_APELLIDO_MATERNO")
	private String cli_apellido_materno;
	
	@Column(name = "CLI_GENERO")
	private String cli_genero;
	
	@Column(name = "CLI_GIRO")
	private String cli_giro;
	
	@Column(name = "CLI_DIRECCION")
	private String cli_direccion;
	
	@Column(name = "CLI_MAIL2")
	private String cli_mail2;
	
	@Column(name = "CLI_TELEFONO2")
	private String cli_telefono2;
	
	@Column(name = "CLI_ESTADO_ENVIO")
	private String cli_estado_envio;
	
	@Column(name = "CLI_REGION")
	private Integer cli_region;
	
	@Column(name = "CLI_CIUDAD")
	private Integer cli_ciudad;
	
	@Column(name = "CLI_COMUNA")
	private Integer cli_comuna;

}
