package com.kui.app.service.mueble.tipoMueble;

import java.util.List;
import com.kui.app.entity.mueble.tipoMueble.Baul;

public interface IBaulService {
	public void guardar(Baul baul);
	public void eliminar(int id_Mueble);
	public List<Baul> obtenerBaules();
}
