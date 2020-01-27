package com.kui.app.entity.mueble.tipoMueble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kui.app.entity.mueble.Mueble;

@Repository
public interface IAlfombraRepo extends JpaRepository<Alfombra, Integer>{

}
