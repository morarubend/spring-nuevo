package com.mora.monitor.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mora.monitor.dto.Ctx_productos_trxdto;
import com.mora.monitor.models.Ctx_productos_trx;
import com.mora.monitor.models.Ctx_productos_trxid;

public interface Ctx_productos_trxdao extends JpaRepository<Ctx_productos_trx, Ctx_productos_trxid>{		

		@Query(value = "SELECT p.ptr_codprod AS codigo, p.ptr_vendedor AS vendedor, p.ptr_cajero AS cajero FROM CTX_PRODUCTOS_TRX p WHERE p.ptr_fcontable BETWEEN :ptr_fcontable AND :ptr_feccomporig", nativeQuery = true)	
		List<Ctx_productos_trxdto> findByClaveThanEqual(@Param("ptr_fcontable") LocalDate ptr_fcontable, @Param("ptr_feccomporig") LocalDate ptr_feccomporig);		

		@Query(nativeQuery = true)
		List<Ctx_productos_trxdto> findProductosdto(LocalDate ptr_fcontable, LocalDate ptr_feccomporig);		
}
