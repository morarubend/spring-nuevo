package com.mora.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mora.dto.Aud_carga_apidto;
import com.mora.models.Aud_carga_api;

public interface Aud_carga_apidao extends JpaRepository<Aud_carga_api, String> {

	@Query(nativeQuery = true)
	List<Aud_carga_apidto> findByClaveThanEqual(@Param("aud_estado") String aud_estado, @Param("aud_fdesde") LocalDate aud_fdesde, @Param("aud_fhasta") LocalDate aud_fhasta);
	
	@Transactional
    @Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "update AUD_CARGA_API SET aud_estado = :aud_estado WHERE aud_idcarga = :aud_idcarga", nativeQuery = true)
	public void updateEstadoUsingQueryAnnotation(@Param("aud_estado") String aud_estado, @Param("aud_idcarga") String aud_idcarga);
    
}
