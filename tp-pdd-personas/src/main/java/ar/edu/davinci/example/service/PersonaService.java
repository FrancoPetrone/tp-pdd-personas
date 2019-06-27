package ar.edu.davinci.example.service;

import java.util.List;

import ar.edu.davinci.example.domain.Persona;
//import ar.edu.davinci.example.exception.NotFoundException;

public interface PersonaService {
	public List<Persona> listarPersonas();

	public Persona buscarPersonaId(Integer id);

	public Persona registrarPersona(Persona persona);

}

//Alumno
//Petrone, Franco