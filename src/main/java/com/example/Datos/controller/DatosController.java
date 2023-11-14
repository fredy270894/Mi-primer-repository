package com.example.Datos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Datos.dto.DtosDto;
import com.example.Datos.servicio.IServicio;

@RestController
public class DatosController {
	
	@Autowired
	IServicio servicio;
	
	@GetMapping("/datosPersonales")
	public List<DtosDto> obtenerDatos(){
		
		return servicio.obtenerDatos();
	}

}
