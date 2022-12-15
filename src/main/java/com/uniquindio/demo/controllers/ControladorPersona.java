/**
 * 
 */
package com.uniquindio.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uniquindio.demo.interfazServices.IPersonaService;
import com.uniquindio.demo.models.Persona;

/**
 * @author GonzalezHDanielaA
 *
 */

@Controller
@RequestMapping
public class ControladorPersona {
	
	@Autowired
	private IPersonaService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Persona> personas = service.listar();
		model.addAttribute("personas", personas);
		return "index";
	}
	

}
