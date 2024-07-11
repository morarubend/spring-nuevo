package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Aud_envio_pos;

public interface Aud_envio_posdao extends JpaRepository<Aud_envio_pos, String> {
	@Query(value = "select * from AUD_ENVIO_POS where aep_idcarga = :aep_idcarga", nativeQuery = true)
	List<Aud_envio_pos> findByClaveThanEqual(@Param("aep_idcarga") String aep_idcarga);
}
