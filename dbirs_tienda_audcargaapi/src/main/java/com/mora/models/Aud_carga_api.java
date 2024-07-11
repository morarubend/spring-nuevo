package com.mora.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import com.mora.dto.Aud_carga_apidto;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@NamedNativeQuery(name = "Aud_carga_api.findByClaveThanEqual",		  
query = "SELECT * from (SELECT aud_idcarga\\:\\:varchar, aud_estado\\:\\:varchar, aud_registros\\:\\:varchar, aud_data\\:\\:varchar, aud_fprocesa\\:\\:varchar, aud_fgraba\\:\\:varchar, aud_colamq\\:\\:varchar, aud_observaciones\\:\\:varchar, aud_fgraba\\:\\:timestamp\\:\\:date AS dario FROM AUD_CARGA_API) u WHERE u.dario BETWEEN :aud_fdesde AND :aud_fhasta AND u.aud_estado = :aud_estado",
resultSetMapping = "Mapping.Aud_carga_apidto")

@SqlResultSetMapping(name = "Mapping.Aud_carga_apidto",
   classes = @ConstructorResult(targetClass = Aud_carga_apidto.class,
                                columns = {
                                		   @ColumnResult(name = "aud_idcarga"),                 		
								   		   @ColumnResult(name = "aud_estado"),
										   @ColumnResult(name = "aud_registros"),
										   @ColumnResult(name = "aud_data"),										   
										   @ColumnResult(name = "aud_fprocesa"),
										   @ColumnResult(name = "aud_fgraba"),
										   @ColumnResult(name = "aud_colamq"),
										   @ColumnResult(name = "aud_observaciones")
                                		}))

@Entity
@Table(name = "AUD_CARGA_API")

public class Aud_carga_api implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "AUD_IDCARGA")
	private String aud_idcarga;
	
    @Column(name = "AUD_ESTADO")
    private String aud_estado;
    
	@Column(name = "AUD_REGISTROS")
	private Integer aud_registros;
	
    @Column(name = "AUD_DATA")
    private String aud_data;
    
	@Column(name = "AUD_FPROCESA")
	private Timestamp aud_fprocesa;
	
	@Column(name = "AUD_FGRABA")
	private Timestamp aud_fgraba;
	
    @Column(name = "AUD_COLAMQ")
    private String aud_colamq;
    
    @Column(name = "AUD_OBSERVACIONES")
    private String aud_observaciones;

}
