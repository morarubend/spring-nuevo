package com.rubenmoraapi.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Ctxdeterrtxid implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "TXER_NUMERO")
	private Integer txer_numero;
	
	@Column(name = "TXER_LOCAL")
	private Integer txer_local;

}
