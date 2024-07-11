package com.mora.monitor.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(irs_cajerosid.class)
@Entity
@Table(name = "IRS_CAJEROS")

public class irs_cajeros implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Id
	@Column(name = "CAJ_CODIGO")
	private String caj_codigo;
	
	@Id
	@Column(name = "LOC_NUMERO")
	private Integer loc_numero;
	
	@Column(name = "CAJ_NOMBRE")
	private String caj_nombre;
	
	@Column(name = "CAJ_RUT")
	private String caj_rut;
	
	@Column(name = "CAJ_TIPO")
	private String caj_tipo;
	
	@Column(name = "CAJ_ACTIVO")
	private String caj_activo;
	
	@Column(name = "CAJ_CODIGO_EMP")
	private String caj_codigo_emp;
	
	@Column(name = "CAJ_ACCION")
	private String caj_accion;
	
	@Column(name = "CAJ_FECHA_CREA")
	private LocalDate caj_fecha_crea;
	
}
