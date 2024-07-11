package com.mora.monitor.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mora.monitor.models.Controlenvio;
import com.mora.monitor.models.Controlenvioid;

public interface Controlenviodao extends JpaRepository<Controlenvio, Controlenvioid> {
	
	@Query(value = "select * from AUD_CONTROL_ENVIO where ace_estado = ?1", nativeQuery = true)
	Controlenvio readControlUsingQueryAnnotation(String ace_estado);
	
	@Query(value = "select * from AUD_CONTROL_ENVIO WHERE ace_fgraba::DATE >= :ace_fconsulta::DATE AND ace_fgraba::DATE <= :ace_fgraba::DATE AND ace_estado = :ace_estado", nativeQuery = true)	
	List<Controlenvio> findByClaveThanEqual(@Param("ace_estado") String ace_estado, @Param("ace_fconsulta") LocalDateTime ace_fconsulta, @Param("ace_fgraba") LocalDateTime ace_fgraba);

    @Transactional
    @Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "update AUD_CONTROL_ENVIO SET ace_estado = :ace_estado WHERE ace_local = :ace_local AND ace_pos = :ace_pos AND aep_idcarga = :aep_idcarga", nativeQuery = true)
	public void updateEstadoUsingQueryAnnotation(@Param("ace_estado") String ace_estado, @Param("ace_local") Integer ace_local, @Param("ace_pos") Integer ace_pos, @Param("aep_idcarga") String aep_idcarga);	
	
}
