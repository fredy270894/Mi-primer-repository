package com.example.Datos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Datos.dto.DtosDto;
import com.example.Datos.repositorio.IRepositorio;

@Service
public class Servicio implements IServicio {
	
	@Autowired
	IRepositorio repo;
	
	public List<DtosDto> obtenerDatos(){
		
		return repo.obtenerRepository();
	}
	
}
