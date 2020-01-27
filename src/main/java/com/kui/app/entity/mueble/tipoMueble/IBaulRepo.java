package com.kui.app.entity.mueble.tipoMueble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBaulRepo extends JpaRepository<Baul, Integer>{

}
