package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.models.Aud_contro_enviom;
import com.example.demo.models.Aud_contro_enviomid;

public interface Aud_contro_enviodao extends JpaRepository<Aud_contro_enviom, Aud_contro_enviomid>{
	@Query(value = "SELECT * from (SELECT ace_local\\:\\:text, ace_pos\\:\\:text, aep_idcarga, ace_estado, ace_fconsulta, ace_fgraba, ace_fgraba\\:\\:timestamp\\:\\:date AS dario, ace_fgraba, ace_fgraba\\:\\:timestamp\\:\\:time AS hora FROM AUD_CONTROL_ENVIO) e \r\n"
			+ "WHERE e.dario BETWEEN '2022-11-24' AND '2022-11-24' and ace_estado = 'SUCCESS'", nativeQuery = true)		
	List<Aud_contro_enviom> findByClaveThanEqual();
}
