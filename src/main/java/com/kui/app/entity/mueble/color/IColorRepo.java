package com.kui.app.entity.mueble.color;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IColorRepo extends JpaRepository<Color,String> {

}
