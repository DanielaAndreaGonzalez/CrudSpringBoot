/**
 * 
 */
package com.uniquindio.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniquindio.demo.interfaces.IPersona;
import com.uniquindio.demo.interfazServices.IPersonaService;
import com.uniquindio.demo.models.Persona;

/**
 * @author GonzalezHDanielaA
 *
 */


 
@Service
public class PersonaService implements IPersonaService{

	@Autowired
	private IPersona data;
	
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Persona p) {
		
		int res=0;
		Persona persona =data.save(p);
		if(!persona.equals(null))
		{
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
