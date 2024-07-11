package com.example.demo.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "AUD_ENVIO_POS")

public class Aud_envio_pos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "AEP_IDCARGA")
	private String aep_idcarga;
	
	@Column(name = "AEP_LOCAL")
	private Integer aep_local;
	
	@Column(name = "AEP_REGISTROS")
	private Integer aep_registros;
	
	@Column(name = "AEP_DATA")
	private String aep_data;
	
	@Column(name = "AEP_FGRABA")
	private Timestamp aep_fgraba;
	
	@Column(name = "AEP_OBSERVACIONES")
	private String aep_observaciones;

}
