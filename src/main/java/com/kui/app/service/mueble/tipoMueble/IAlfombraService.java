package com.kui.app.service.mueble.tipoMueble;


import java.util.List;

import com.kui.app.entity.mueble.tipoMueble.Alfombra;

public interface IAlfombraService {

	public void guardar(Alfombra alfombra);
	public void eliminar(int id_Mueble);
	public List<Alfombra> obtenerAlfombras();
}
