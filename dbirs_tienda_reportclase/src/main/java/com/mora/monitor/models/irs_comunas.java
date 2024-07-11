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
@Table(name = "IRS_COMUNAS")

public class irs_comunas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Id
	@Column(name = "COM_NUMERO")
	private Integer com_numero;
	
    @Column(name = "COM_DESCRIPCION")
    private String com_descripcion;
    
	@Column(name = "REG_NUMERO")
	private Integer reg_numero;

}
