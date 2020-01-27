package com.kui.app.entity.mueble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMuebleRepo extends JpaRepository<Mueble,Integer>{

}
