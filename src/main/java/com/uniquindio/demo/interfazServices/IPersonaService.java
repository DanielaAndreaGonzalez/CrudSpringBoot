/**
 * 
 */
package com.uniquindio.demo.interfazServices;

import java.util.List;
import java.util.Optional;

import com.uniquindio.demo.models.Persona;

/**
 * @author GonzalezHDanielaA
 *
 */
public interface IPersonaService {

	
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete(int id);
	
}
