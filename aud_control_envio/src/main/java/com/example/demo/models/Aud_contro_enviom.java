package com.example.demo.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@IdClass(Aud_contro_enviomid.class)

@Table(name = "AUD_CONTROL_ENVIO")

public class Aud_contro_enviom implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ACE_LOCAL")
	private Integer ace_local;
	
	@Id
	@Column(name = "ACE_POS")
	private Integer ace_pos;
	
	@Id
	@Column(name = "AEP_IDCARGA")
	private String aep_idcarga;
	
	@Column(name = "ACE_ESTADO")
	private String ace_estado;
	
	@Column(name = "ACE_FCONSULTA")
	private Timestamp ace_fconsulta;
	
	@Column(name = "ACE_FGRABA")
	private Timestamp ace_fgraba;

}
