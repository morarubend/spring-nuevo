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
@Table(name = "IRS_REGIONES")

public class irs_regiones implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Id
	@Column(name = "REG_NUMERO")
	private Integer reg_numero;
	
    @Column(name = "REG_DESCRIPCION")
    private String reg_descripcion;

}
