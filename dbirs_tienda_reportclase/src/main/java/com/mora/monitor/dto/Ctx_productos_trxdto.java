package com.mora.monitor.dto;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ctx_productos_trxdto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer LOCAL;
	private String CLAVE;	
	private String NOMBREVENDEDOR;
	private String CAJERO;		
	private String UNIDAD;
	private String CATEGORIA;
	private String LINEA;
	private String MODELO;
	private String CODIGOPRODUCTO;
	private String DESCRIPCIONPRODUCTO;
	private String TIPODOCUMENTO;
	
	private String FECHADOCUMENTO;
	
	private String RUT_CLIENTE;
	
//	private String HED_NOMCLTE;
//	private String CLIENTE_NOMBRE;
	
	private String HED_DIRCLTE;
	private String HED_GIRO;
	private String COM_DESCRIPCION;
	private String REG_DESCRIPCION;	
	private String ESTADO;
	private String NUMERODOCUMENTO;
	private Double UNIDADES;
	private Double MONTO;
	private Double DSCTO;
	private Double TOTAL;
}
