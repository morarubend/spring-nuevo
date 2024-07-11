package com.mora.monitor.models;

import java.io.Serializable;

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
@IdClass(rep_cbarraprodid.class)

@Table(name = "REP_CBARRAPROD")

public class rep_cbarraprod implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PRD_CODIGO")
	private String prd_codigo;
	
	@Id
	@Column(name = "CBP_CODBARRA")
	private String cbp_codbarra;
	
	@Column(name = "CBP_PRINCIPAL")
	private String cbp_principal;
	
	@Column(name = "CBP_TIPOEAN")
	private String cbp_tipoean;
	
	@Column(name = "CBP_ACCION")
	private String cbp_accion;
	
}
