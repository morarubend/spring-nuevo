package com.rubenmoraapi.models;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class Irslocalesposid implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer loc_numero;
	private Integer lpo_pos;
}
