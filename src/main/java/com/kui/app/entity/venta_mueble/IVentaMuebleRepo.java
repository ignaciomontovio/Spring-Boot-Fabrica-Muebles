package com.kui.app.entity.venta_mueble;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentaMuebleRepo extends JpaRepository<VentaMueble,Integer>{
	List<VentaMueble> findByid(VentaMueblePK ventaMueblePk);
}
