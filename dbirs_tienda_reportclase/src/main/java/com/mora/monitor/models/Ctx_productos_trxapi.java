package com.mora.monitor.models;

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

public class Ctx_productos_trxapi {
/*	
	private String clave;
	private String nombrevendedor;
	private String cajero;
	private String unidad;
	private String categoria;
	private String linea;
	private String modelo;
	private String codigoproducto;
	private String descripcionproducto;
	private String tipodocumento;
	private LocalDate fechadocumento;
	private float monto;
*/
/*
	private Integer hed_pais;
	private Integer hed_origentrx;
	private Integer hed_local;
	private Integer hed_pos;
	private Integer hed_numtrx;
	private LocalDate hed_fechatrx;
	private LocalTime hed_horatrx;
	private Integer ptr_corrprod;
	private Integer ptr_codprod;
*/
	private Integer hed_local;
	private String ptr_codprod;
	private LocalDate ptr_fcontable;
	private Integer ptr_catprod;
	private Float ptr_brutopos;
	private Float ptr_brutoneg;
	private Float ptr_impuesto;
	private Integer ptr_unidades;	
	private Integer ptr_peso;
	private String ptr_pescant;
	private String ptr_anulado;
	private String ptr_ingreso;
	private Float ptr_total;
	private String ptr_tipodoc;
	private String ptr_subtipo;
	private String ptr_tipotrx;
	private String ptr_cajero;
	private Integer ptr_factor;
	private String ptr_vendedor;
	private Integer hed_numdoc;
	private Integer ptr_costo;
	private Float ptr_preciolist;
	private Float ptr_preciovta;
	private String ptr_umedida;
	private String ptr_umedsap;
	private String ptr_fraccionado;
	private String ptr_consignado;
	private Float ptr_mtobono;
	private Integer ptr_fraccion;
	private String ptr_lam;
	private Integer ptr_usuario1;
	private Integer ptr_usuario2;
	private String ptr_usuario3;
	private String ptr_usuario4;
	private String ptr_nrocel;
	private String ptr_tipocomporig;	
	private Integer ptr_nrocomporig;
	private Integer ptr_loccomprig;
	private LocalDate ptr_feccomporig;
	private LocalDate rpl_fecha_graba;
	private LocalDate rpl_fecha_actualiza;
	private String ptr_subtipo2;
	private String ptr_tipoprod;
	private String ptr_despacho;
	private Integer ptr_corrprodgar;
	private Float ptr_imptounitario;
	private Float ptr_montoexento;
	private Float ptr_montoneto;
	private String ptr_idtrx;
	private LocalDateTime vta_checkpoint;
	private Integer flag_kardex;			
	private String ptr_sinsku;	
	private Float ptr_uniddisp;

}
