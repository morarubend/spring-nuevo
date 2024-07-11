package com.rubenmoraapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rubenmoraapi.models.Irslocales;

public interface Irslocalesdao extends JpaRepository<Irslocales, Long> {
	@Modifying
	@Query(value = "insert into irs_locales (loc_numero,loc_descripcion,loc_tipo,loc_activo,reg_numero,cad_numero,loc_porcbase,loc_tipocua,loc_rut,"
			+ "loc_centrocosto,loc_codcomercio2,loc_sociedad,loc_division,loc_tipocambio,mon_codigo,loc_monedabase,loc_deposito,loc_ip2,loc_ip,"
			+ "loc_direccion,loc_comuna,loc_ciudad,loc_descorta,loc_cprecio,loc_stkbatch,loc_aplicadte,loc_codigoos,loc_usrftp,loc_pwdftp,loc_bbrpath,"
			+ "loc_orgcomprasap,loc_orgvtasap,loc_modovtacomb,zon_codigo,loc_tiposap,loc_litroscalib,loc_numturnos,loc_maqaspirado,loc_numerosap,"
			+ "loc_numeropmm,loc_tinactividad,loc_idclientecons,loc_extractor,loc_origentrx)"
			+ "VALUES(:loc_numero,:loc_descripcion,:loc_tipo,:loc_activo,:reg_numero,:cad_numero,:loc_porcbase,:loc_tipocua,:loc_rut,:loc_centrocosto,"
			+ ":loc_codcomercio2,:loc_sociedad,:loc_division,:loc_tipocambio,:mon_codigo,:loc_monedabase,:loc_deposito,:loc_ip2,:loc_ip,:loc_direccion,"
			+ ":loc_comuna,:loc_ciudad,:loc_descorta,:loc_cprecio,:loc_stkbatch,:loc_aplicadte,:loc_codigoos,:loc_usrftp,:loc_pwdftp,:loc_bbrpath,"
			+ ":loc_orgcomprasap,:loc_orgvtasap,:loc_modovtacomb,:zon_codigo,:loc_tiposap,:loc_litroscalib,:loc_numturnos,:loc_maqaspirado,:loc_numerosap,"
			+ ":loc_numeropmm,:loc_tinactividad,:loc_idclientecons,:loc_extractor,:loc_origentrx)", nativeQuery = true)
	public void insertLocalUsingQueryAnnotation(@Param("loc_numero") Long loc_numero, @Param("loc_descripcion") String loc_descripcion,
			@Param("loc_tipo") String loc_tipo, @Param("loc_activo") String loc_activo,
			@Param("reg_numero") int reg_numero, @Param("cad_numero") int cad_numero, @Param("loc_porcbase") int loc_porcbase,
			@Param("loc_tipocua") String loc_tipocua, @Param("loc_rut") String loc_rut, @Param("loc_centrocosto") String loc_centrocosto,
			@Param("loc_codcomercio2") int loc_codcomercio2, @Param("loc_sociedad") String loc_sociedad, @Param("loc_division") String loc_division,
			@Param("loc_tipocambio") int loc_tipocambio, @Param("mon_codigo") String mon_codigo, @Param("loc_monedabase") int loc_monedabase,
			@Param("loc_deposito") String loc_deposito, @Param("loc_ip2") String loc_ip2, @Param("loc_ip") String loc_ip,
			@Param("loc_direccion") String loc_direccion, @Param("loc_comuna") String loc_comuna, @Param("loc_ciudad") String loc_ciudad,
			@Param("loc_descorta") String loc_descorta, @Param("loc_cprecio") String loc_cprecio, @Param("loc_stkbatch") String loc_stkbatch,
			@Param("loc_aplicadte") String loc_aplicadte, @Param("loc_codigoos") String loc_codigoos, @Param("loc_usrftp") String loc_usrftp,
			@Param("loc_pwdftp") String loc_pwdftp, @Param("loc_bbrpath") String loc_bbrpath, @Param("loc_orgcomprasap") String loc_orgcomprasap,
			@Param("loc_orgvtasap") String loc_orgvtasap, @Param("loc_modovtacomb") String loc_modovtacomb, @Param("zon_codigo") int zon_codigo,
			@Param("loc_tiposap") String loc_tiposap, @Param("loc_litroscalib") int loc_litroscalib, @Param("loc_numturnos") int loc_numturnos,
			@Param("loc_maqaspirado") int loc_maqaspirado, @Param("loc_numerosap") String loc_numerosap, @Param("loc_numeropmm") int loc_numeropmm,
			@Param("loc_tinactividad") int loc_tinactividad, @Param("loc_idclientecons") int loc_idclientecons, @Param("loc_extractor") String loc_extractor,
			@Param("loc_origentrx") int loc_origentrx);
	
	@Modifying
	@Query(value = "update irs_locales SET loc_activo = :loc_activo, loc_rut = :loc_rut WHERE loc_numero = :loc_numero", nativeQuery = true)
	public void updateLocalUsingQueryAnnotation(@Param("loc_activo") String loc_activo, @Param("loc_rut") String loc_rut, @Param("loc_numero") Long loc_numero);
	
	@Query(value = "select * from irs_locales where loc_numero = ?1", nativeQuery = true)
	Irslocales readLocalUsingQueryAnnotation(Long loc_numero);
	
}
