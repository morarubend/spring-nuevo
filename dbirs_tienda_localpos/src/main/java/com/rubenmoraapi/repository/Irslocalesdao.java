package com.rubenmoraapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.rubenmoraapi.models.Irslocalespos;
import com.rubenmoraapi.models.Irslocalesposid;

public interface Irslocalesdao extends JpaRepository<Irslocalespos, Irslocalesposid> {

//	Irslocalespos findByLoc_numeroAndLpo_pos(Integer loc_numero, Integer lpo_pos);
	
	@Modifying
	@Query(value = "insert into irs_localespos (loc_numero,lpo_pos,lpo_numero,lpo_descripcion,lpo_activo,lpo_ip,lpo_usrftp,lpo_pwdftp,lpo_bbrpath) "
			+ "VALUES(:loc_numero,:lpo_pos,:lpo_numero,:lpo_descripcion,:lpo_activo,:lpo_ip,:lpo_usrftp,:lpo_pwdftp,:lpo_bbrpath)", nativeQuery = true)
	public void insertPosUsingQueryAnnotation(@Param("loc_numero") int loc_numero, @Param("lpo_pos") int lpo_pos,
			@Param("lpo_numero") String lpo_numero, @Param("lpo_descripcion") String lpo_descripcion,
			@Param("lpo_activo") String lpo_activo, @Param("lpo_ip") String lpo_ip, @Param("lpo_usrftp") String lpo_usrftp,
			@Param("lpo_pwdftp") String lpo_pwdftp, @Param("lpo_bbrpath") String lpo_bbrpath);
	
	@Modifying
	@Query(value = "update irs_localespos SET lpo_activo = :lpo_activo WHERE loc_numero = :loc_numero AND lpo_pos = :lpo_pos", nativeQuery = true)
	public void updatePosUsingQueryAnnotation(@Param("lpo_activo") String lpo_activo, @Param("loc_numero") int loc_numero, @Param("lpo_pos") int lpo_pos);
	
	@Query(value = "select * from irs_localespos where loc_numero = ?1 AND lpo_pos = ?2", nativeQuery = true)
	Irslocalespos readPosUsingQueryAnnotation(int loc_numero, int lpo_pos);
	
}
