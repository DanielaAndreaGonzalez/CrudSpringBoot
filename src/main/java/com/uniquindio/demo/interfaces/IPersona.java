/**
 * 
 */
package com.uniquindio.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uniquindio.demo.models.Persona;

/**
 * @author GonzalezHDanielaA
 *
 */

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{
	

	
	
}
