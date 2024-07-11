package com.mora.monitor.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(Ctxenviovtaid.class)

@Table(name = "CTX_ENVIO_VTA")

public class Ctxenviovta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "HED_PAIS")
	private Integer hed_pais;
	
	@Id
	@Column(name = "HED_ORIGENTRX")
	private Integer hed_origentrx;
	
	@Id
	@Column(name = "HED_LOCAL")
	private Integer hed_local;
	
	@Id
	@Column(name = "HED_POS")
	private Integer hed_pos;
	
	@Id
	@Column(name = "HED_NUMTRX")
	private Integer hed_numtrx;
	
	@Id
	@Column(name = "HED_FECHATRX")
	private LocalDateTime hed_fechatrx;
	
	@Id
	@Column(name = "HED_HORATRX")
	private LocalDateTime hed_horatrx;
	
	@Column(name = "ENV_IDTRX")
	private String env_idtrx;
	
	@Column(name = "ENV_IDLOTE")
	private String env_idlote;
	
	@Column(name = "ENV_ESTADO")
	private String env_estado;
	
	@Column(name = "ENV_DATA")
	private String env_data;
	
	@Column(name = "ENV_RESPONSE")
	private String env_response;
	
	@Column(name = "ENV_PROCESS")
	private LocalDate env_process;
	
	@Column(name = "ENV_RETRIES")
	private Integer env_retries;
	
	@Column(name = "ENV_FECHAGRABA")
	private LocalDate env_fechagraba;
/*	
    @ManyToOne(cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumns(value = {
        @JoinColumn(
            name = "hed_pais", referencedColumnName = "hed_pais", insertable = false, updatable = false),
        @JoinColumn(
            name = "hed_origentrx", referencedColumnName = "hed_origentrx", insertable = false, updatable = false),
        @JoinColumn(
            name = "hed_local", referencedColumnName = "hed_local", insertable = false, updatable = false),       
        @JoinColumn(
            name = "hed_pos", referencedColumnName = "hed_pos", insertable = false, updatable = false),        
        @JoinColumn(
            name = "hed_numtrx", referencedColumnName = "hed_numtrx", insertable = false, updatable = false),       
        @JoinColumn(
            name = "hed_fechatrx", referencedColumnName = "hed_fechatrx", insertable = false, updatable = false),       
        @JoinColumn(
            name = "hed_horatrx", referencedColumnName = "hed_horatrx", insertable = false, updatable = false)
    })
    private Ctxheadertrx ctxheadertrx; 
*/

}
