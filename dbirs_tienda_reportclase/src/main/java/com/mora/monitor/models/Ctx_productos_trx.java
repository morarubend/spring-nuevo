package com.mora.monitor.models;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.*;

import com.mora.monitor.dto.Ctx_productos_trxdto;

import lombok.Data;

@Data

@NamedNativeQuery(name = "Ctx_productos_trx.findProductosdto",		  
query = "SELECT    CPT.HED_LOCAL AS LOCAL,    CPT.PTR_VENDEDOR || H.HED_NUMDOC\\:\\:text || CPT.PTR_CODPROD AS CLAVE,    CASE WHEN C.CAJ_NOMBRE IS NOT NULL THEN RTRIM (C.CAJ_NOMBRE)    ELSE 'Vendedor No Identificado - ' || CPT.PTR_VENDEDOR\r\n"
		+ "    END AS NOMBREVENDEDOR,    CASE WHEN C.CAJ_NOMBRE IS NOT NULL THEN RTRIM (C.CAJ_NOMBRE)    ELSE 'Cajero No Identificado - ' || CPT.PTR_CAJERO\r\n"
		+ "    END AS CAJERO, FN_OBTENERCATANT (P.CAT_CODIGO,1) AS UNIDAD,    FN_OBTENERCATANT (P.CAT_CODIGO,2) AS CATEGORIA,    FN_OBTENERCATANT (P.CAT_CODIGO,3) AS LINEA,    PRD_CODPADRE AS MODELO,    CPT.PTR_CODPROD AS CODIGOPRODUCTO,    P.PRD_DESCR AS DESCRIPCIONPRODUCTO,    CASE CPT.PTR_TIPODOC\r\n"
		+ "                    WHEN 'BLT' THEN 'Boleta Electrónica'                    WHEN 'BLM' THEN 'Boleta Manual'                    WHEN 'NCR' THEN 'Nota de Crédito'                    WHEN 'FCT' THEN 'Facturas'                    WHEN 'DI' THEN 'Documentos IRS'                    WHEN 'X' THEN 'Tipo de Documento no Identificado'                    WHEN 'CF' THEN 'Cliente Fidelizado'                    WHEN 'FE' THEN 'Factura Electrónica'                    WHEN 'NE' THEN 'Nota de Crédito Electrónica'                    WHEN 'NF' THEN 'Nota de Crédito F.P.'                    ELSE 'Doc. No Declarado'    END TIPODOCUMENTO,    CPT.HED_FECHATRX\\:\\:varchar AS FECHADOCUMENTO,    H.HED_RUTDOC AS RUT_CLIENTE,    H.HED_NOMCLTE\\:\\:varchar AS CLIENTE_NOMBRE,    H.HED_DIRCLTE,    H.HED_GIRO,    IC.COM_DESCRIPCION,    IR.REG_DESCRIPCION,    CASE CPT.PTR_ANULADO\r\n"
		+ "                    WHEN 'D' THEN 'Devolución'                    WHEN 'N' THEN 'Normal'                    WHEN 'A' THEN 'Anulado'    END ESTADO,    H.HED_NUMDOC\\:\\:varchar AS NUMERODOCUMENTO,    SUM(CPT.PTR_UNIDADES * CPT.PTR_FACTOR) AS UNIDADES,    COALESCE ((CPT.PTR_BRUTOPOS * CPT.PTR_FACTOR), 0) AS MONTO,    SUM(COALESCE ((CPT.PTR_BRUTONEG), 0) * CPT.PTR_UNIDADES) AS DSCTO,    SUM(COALESCE ((CPT.PTR_TOTAL * CPT.PTR_FACTOR), 0)) AS TOTAL\r\n"
		+ "FROM CTX_PRODUCTOS_TRX CPT\r\n"
		+ "LEFT JOIN REP_CBARRAPROD CB ON (CPT.PTR_CODPROD = CB.CBP_CODBARRA)LEFT JOIN IRS_CAJEROS C ON (CPT.PTR_VENDEDOR = C.CAJ_CODIGO AND CPT.HED_LOCAL = C.LOC_NUMERO)LEFT JOIN IRS_LOCALES L ON (L.LOC_NUMERO = CPT.HED_LOCAL)LEFT JOIN CTX_HEADER_TRX H ON H.HED_LOCAL = CPT.HED_LOCAL\r\n"
		+ "AND H.HED_NUMTRX = CPT.HED_NUMTRX\r\n"
		+ "AND H.HED_POS = CPT.HED_POS\r\n"
		+ "AND H.HED_FECHATRX = CPT.HED_FECHATRX\r\n"
		+ "AND H.HED_FCONTABLE = CPT.PTR_FCONTABLE\r\n"
		+ "LEFT JOIN IRS_PRODUCTOS P ON P.PRD_CODIGO = CB.PRD_CODIGO\r\n"
		+ "LEFT JOIN CTX_CLIENTES_TRX CL ON CL.HED_LOCAL = CPT.HED_LOCAL\r\n"
		+ "AND CL.HED_NUMTRX = CPT.HED_NUMTRX\r\n"
		+ "AND CL.HED_POS = CPT.HED_POS\r\n"
		+ "AND CL.HED_FECHATRX = CPT.HED_FECHATRX\r\n"
		+ "LEFT JOIN IRS_COMUNAS IC ON (IC.COM_NUMERO = H.HED_COMUNA)LEFT JOIN IRS_REGIONES IR ON (IR.REG_NUMERO = H.HED_REGION)WHERE CPT.PTR_ANULADO IN ('N','D')    AND CPT.PTR_FCONTABLE BETWEEN :ptr_fcontable AND :ptr_feccomporig    AND CPT.PTR_TIPODOC NOT IN ('TF','TG','FG')GROUP BY    CPT.HED_LOCAL,    C.CAJ_NOMBRE,    CPT.PTR_ANULADO,    H.HED_NUMDOC,    CPT.PTR_TIPODOC,    CPT.HED_FECHATRX,    CPT.PTR_CODPROD,    P.PRD_DESCR,    CPT.PTR_VENDEDOR,    CPT.PTR_CAJERO,    P.PRD_COLOR,    P.CAT_CODIGO,    PRD_CODPADRE,    CPT.PTR_FACTOR,    CPT.PTR_BRUTOPOS,    H.HED_RUTDOC,    H.HED_NOMCLTE\\:\\:varchar,    H.HED_DIRCLTE,    H.HED_GIRO,    IC.COM_DESCRIPCION,    IR.REG_DESCRIPCION\r\n"
		+ "ORDER BY C.CAJ_NOMBRE, CPT.PTR_TIPODOC",
resultSetMapping = "Mapping.Ctx_productos_trxdto")

@SqlResultSetMapping(name = "Mapping.Ctx_productos_trxdto",
   classes = @ConstructorResult(targetClass = Ctx_productos_trxdto.class,
                                columns = {@ColumnResult(name = "LOCAL"),                                		
										   @ColumnResult(name = "CLAVE"),										   
										   @ColumnResult(name = "NOMBREVENDEDOR"),
										   @ColumnResult(name = "CAJERO"),										   
										   @ColumnResult(name = "UNIDAD"),
										   @ColumnResult(name = "CATEGORIA"),
										   @ColumnResult(name = "LINEA"),
										   @ColumnResult(name = "MODELO"),
										   @ColumnResult(name = "CODIGOPRODUCTO"),
										   @ColumnResult(name = "DESCRIPCIONPRODUCTO"),
										   @ColumnResult(name = "TIPODOCUMENTO"),
										   @ColumnResult(name = "FECHADOCUMENTO"),
										   @ColumnResult(name = "RUT_CLIENTE"),
//										   @ColumnResult(name = "HED_NOMCLTE,"),
//										   @ColumnResult(name = "CLIENTE_NOMBRE,"),
										   @ColumnResult(name = "HED_DIRCLTE"),
										   @ColumnResult(name = "HED_GIRO"),
										   @ColumnResult(name = "COM_DESCRIPCION"),
										   @ColumnResult(name = "REG_DESCRIPCION"),
										   @ColumnResult(name = "ESTADO"),
										   @ColumnResult(name = "NUMERODOCUMENTO"),
										   @ColumnResult(name = "UNIDADES"),
										   @ColumnResult(name = "MONTO"),
										   @ColumnResult(name = "DSCTO"),							  										   
                                           @ColumnResult(name = "TOTAL")                               
                                		}))
@Entity
@IdClass(Ctx_productos_trxid.class)

@Table(name = "CTX_PRODUCTOS_TRX")

public class Ctx_productos_trx implements Serializable {

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
	
	@Id
	@Column(name = "PTR_CORRPROD")
	private Integer ptr_corrprod;
	
	@Id
	@Column(name = "PTR_CODPROD")
	private String ptr_codprod;

	@Column(name = "PTR_FCONTABLE")
	private LocalDate ptr_fcontable;
	
	@Column(name = "PTR_CATPROD")
	private Integer ptr_catprod;
	
	@Column(name = "PTR_BRUTOPOS")
	private Float ptr_brutopos;
	
	@Column(name = "PTR_BRUTONEG")
	private Float ptr_brutoneg;
	
	@Column(name = "PTR_IMPUESTO")
	private Float ptr_impuesto;
	
	@Column(name = "PTR_UNIDADES")
	private Integer ptr_unidades;
	
	@Column(name = "PTR_PESO")
	private Integer ptr_peso;
		
	@Column(name = "PTR_PESCANT")
	private String ptr_pescant;
	
	@Column(name = "PTR_ANULADO")
	private String ptr_anulado;
	
	@Column(name = "PTR_INGRESO")
	private String ptr_ingreso;
	
	@Column(name = "PTR_TOTAL")
	private Float ptr_total;
	
	@Column(name = "PTR_TIPODOC")
	private String ptr_tipodoc;
	
	@Column(name = "PTR_SUBTIPO")
	private String ptr_subtipo;
	
	@Column(name = "PTR_TIPOTRX")
	private String ptr_tipotrx;
	
	@Column(name = "PTR_CAJERO")
	private String ptr_cajero;
		
	@Column(name = "PTR_FACTOR")
	private Integer ptr_factor;
	
	@Column(name = "PTR_VENDEDOR")
	private String ptr_vendedor;
	
	@Column(name = "HED_NUMDOC")
	private Integer hed_numdoc;
	
	@Column(name = "PTR_COSTO")
	private Integer ptr_costo;
	
	@Column(name = "PTR_PRECIOLISTA")
	private Float ptr_preciolist;
	
	@Column(name = "PTR_PRECIOVTA")
	private Float ptr_preciovta;
	
	@Column(name = "PTR_UMEDIDA")
	private String ptr_umedida;
	
	@Column(name = "PTR_UMEDSAP")
	private String ptr_umedsap;
	
	@Column(name = "PTR_FRACCIONADO")
	private String ptr_fraccionado;
	
	@Column(name = "PTR_CONSIGNADO")
	private String ptr_consignado;
	
	@Column(name = "PTR_MTOBONO")
	private Float ptr_mtobono;
		
	@Column(name = "PTR_FRACCION")
	private Integer ptr_fraccion;
	
	@Column(name = "PTR_LAM")
	private String ptr_lam;
	
	@Column(name = "PTR_USUARIO1")
	private Integer ptr_usuario1;
	
	@Column(name = "PTR_USUARIO2")
	private Integer ptr_usuario2;
		
	@Column(name = "PTR_USUARIO3")
	private String ptr_usuario3;
	
	@Column(name = "PTR_USUARIO4")
	private String ptr_usuario4;
	
	@Column(name = "PTR_nrocel")
	private String ptr_nrocel;
	
	@Column(name = "PTR_TIPOCOMPORIG")
	private String ptr_tipocomporig;	
	
	@Column(name = "PTR_NROCOMPORIG")
	private Integer ptr_nrocomporig;
	
	@Column(name = "PTR_LOCCOMPORIG")
	private Integer ptr_loccomporig;
		
	@Column(name = "PTR_FECCOMPORIG")
	private LocalDate ptr_feccomporig;
	
	@Column(name = "RPL_FECHA_GRABA")
	private LocalDate rpl_fecha_graba;
	
	@Column(name = "RPL_FECHA_ACTUALIZA")
	private LocalDate rpl_fecha_actualiza;
	
	@Column(name = "PTR_SUBTIPO2")
	private String ptr_subtipo2;
	
	@Column(name = "PTR_TIPOPROD")
	private String ptr_tipoprod;
	
	@Column(name = "PTR_DESPACHO")
	private String ptr_despacho;
		
	@Column(name = "PTR_CORRPRODGAR")
	private Integer ptr_corrprodgar;
	
	@Column(name = "PTR_IMPTOUNITARIO")
	private Float ptr_imptounitario;
	
	@Column(name = "PTR_MONTOEXENTO")
	private Float ptr_montoexento;
	
	@Column(name = "PTR_MONTONETO")
	private Float ptr_montoneto;
	
	@Column(name = "PTR_IDTRX")
	private String ptr_idtrx;
		
	@Column(name = "VTA_CHECKPOINT")
	private LocalDateTime vta_checkpoint;
	
	@Column(name = "FLAG_KARDEX")
	private Integer flag_kardex;
			
	@Column(name = "PTR_SINSKU")
	private String ptr_sinsku;
		
	@Column(name = "PTR_UNIDDISP")
	private Float ptr_uniddisp;
	
	
}
