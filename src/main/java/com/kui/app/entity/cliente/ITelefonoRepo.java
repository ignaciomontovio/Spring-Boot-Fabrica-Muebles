package com.kui.app.entity.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITelefonoRepo extends JpaRepository<Telefono, Integer>{
	
}
