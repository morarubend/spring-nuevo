package com.mora.monitor.models;

import java.io.Serializable;
import java.sql.Timestamp;
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

import com.mora.monitor.dto.Leecontrolenviodto;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@NamedNativeQuery(name = "Leecontrolenvio.findByClaveThanEqual",		  
query = "SELECT * from (SELECT ace_local\\:\\:varchar, ace_pos\\:\\:varchar, aep_idcarga, ace_estado, ace_fconsulta\\:\\:varchar, ace_fgraba\\:\\:varchar, ace_fgraba\\:\\:timestamp\\:\\:date AS dario FROM AUD_CONTROL_ENVIO) u WHERE u.dario BETWEEN :ace_fdesde AND :ace_fhasta AND u.ace_estado = :ace_estadot",
resultSetMapping = "Mapping.Leecontrolenviodto")

@SqlResultSetMapping(name = "Mapping.Leecontrolenviodto",
   classes = @ConstructorResult(targetClass = Leecontrolenviodto.class,
                                columns = {
                                		   @ColumnResult(name = "ace_local"),                 		
								   		   @ColumnResult(name = "ace_pos"),
										   @ColumnResult(name = "aep_idcarga"),
										   @ColumnResult(name = "ace_estado"),										   
										   @ColumnResult(name = "ace_fconsulta"),
										   @ColumnResult(name = "ace_fgraba")
                                		}))

@Entity
@IdClass(Leecontrolenvioid.class)

@Table(name = "AUD_CONTROL_ENVIO")

public class Leecontrolenvio implements Serializable{

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
/*	
    @ManyToOne(cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "aep_idcarga", insertable = false, updatable = false, referencedColumnName = "aep_idcarga")
    private Leeenviopos enviopos; 
*/
}
