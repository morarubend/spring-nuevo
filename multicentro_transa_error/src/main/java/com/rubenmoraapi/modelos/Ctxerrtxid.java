package com.rubenmoraapi.modelos;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class Ctxerrtxid implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer txer_numero;
	private Integer txer_local;

}
