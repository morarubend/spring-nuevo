package com.mora.monitor.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mora.monitor.dto.Leecontrolenviodto;
import com.mora.monitor.models.Leecontrolenvio;
import com.mora.monitor.models.Leecontrolenvioid;

public interface Leecontrolenviodao extends JpaRepository<Leecontrolenvio, Leecontrolenvioid>{

//	@Query(value = "select * from AUD_CONTROL_ENVIO u WHERE u.ace_fgraba >= :ace_fconsulta AND u.ace_fgraba <= :ace_fgraba AND u.ace_estado = :ace_estado", nativeQuery = true)

	@Query(nativeQuery = true)
	List<Leecontrolenviodto> findByClaveThanEqual(@Param("ace_estadot") String ace_estadot, @Param("ace_fdesde") LocalDate ace_fdesde, @Param("ace_fhasta") LocalDate ace_fhasta);
}
