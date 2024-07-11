package com.mora.monitor.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(Controlenvioid.class)

@Table(name = "AUD_CONTROL_ENVIO")

public class Controlenvio implements Serializable{

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
	private LocalDateTime ace_fconsulta;
	
	@Column(name = "ACE_FGRABA")
	private LocalDateTime ace_fgraba;
	
    @ManyToOne(cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "aep_idcarga", insertable = false, updatable = false, referencedColumnName = "aep_idcarga")
    private Enviopos enviopos; 

}
