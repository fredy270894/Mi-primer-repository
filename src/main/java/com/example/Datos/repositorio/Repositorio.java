package com.example.Datos.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Datos.dto.DireccionDto;
import com.example.Datos.dto.DtosDto;
import com.example.Datos.dto.Pasatiempos;

@Repository
public class Repositorio implements IRepositorio {
	
	public List<DtosDto> obtenerRepository() {
		List<DtosDto> datosLista = new ArrayList<DtosDto>();
		
		DtosDto datos = new DtosDto();
		
		datos.setNombre("Fredy");
		datos.setApellido("Valencia");
		datos.setSexo("M");
		datos.setComunidad("Tezoquipan");
		
		DireccionDto direccion = new DireccionDto();
		
		direccion.setCalle("Reforma");
		direccion.setColonia("Apatlaco");
		direccion.setEstado("Tlaxcala");
		direccion.setNumero(21);
		
		datos.setDireccion(direccion);
		
		Pasatiempos pasatiempo = new Pasatiempos();
		
		pasatiempo.setComer("3 veces al dia");
		pasatiempo.setDormir("8 horas diarias");
		pasatiempo.setJugar("1 Hora al dia");
		pasatiempo.setTiempoVailar("De vez en cuando");
		
		direccion.setHobbies(pasatiempo);
		
		datosLista.add(datos);
		
		return datosLista;
		
	}

}
