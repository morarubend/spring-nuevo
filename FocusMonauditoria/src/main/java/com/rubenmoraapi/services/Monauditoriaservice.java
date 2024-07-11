package com.rubenmoraapi.services;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rubenmoraapi.modelos.Monauditoria;
import com.rubenmoraapi.repository.Monauditoriadao;
@Service
public class Monauditoriaservice implements Monauditoriaservicei {
	@Autowired
	private Monauditoriadao monauditoriadao;
	
	public List<Monauditoria> findAll() {
		return (List<Monauditoria>) monauditoriadao.findAll();
	}
	
    @Override
    @Transactional
    public Monauditoria insert(Monauditoria monauditoria) {
        return monauditoriadao.save(monauditoria);
    }
	
	@Override
	@Transactional
	public String insertAuditoria(Monauditoria pos) {		
		Long aud_idregistro = pos.getAud_idregistro();
		String aud_usuario = pos.getAud_usuario();	
		String aud_sistema = pos.getAud_sistema();
		String aud_cliente = pos.getAud_cliente();		
		Date aud_fecha = pos.getAud_fecha();
		Time aud_hora = pos.getAud_hora();
		String aud_modulo = pos.getAud_modulo();			
		String aud_tiporeg = pos.getAud_tiporeg();		
		String aud_registro_afectado = pos.getAud_registro_afectado();
		String aud_valor_inicio = pos.getAud_valor_inicio();
		String aud_valor_fin = pos.getAud_valor_fin();
		String aud_observaciones = pos.getAud_observaciones();
	
		monauditoriadao.insertAuditoriaUsingQueryAnnotation(aud_idregistro, aud_usuario, aud_sistema, aud_cliente,
				aud_fecha,aud_hora, aud_modulo, aud_tiporeg, aud_registro_afectado, aud_valor_inicio, aud_valor_fin,
				aud_observaciones);
		return "Registro insertado";
	}
}
