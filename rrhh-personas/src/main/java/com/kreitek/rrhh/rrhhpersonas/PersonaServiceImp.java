package com.kreitek.rrhh.rrhhpersonas;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImp implements PersonaService{

    private final PersonaRepository personaRepository;

    public PersonaServiceImp(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> getAllPersonas() {
      List<Persona> personas = new ArrayList<>();
      personaRepository.findAll().forEach(employee -> personas.add(employee));
      return personas;
    }

    @Override
    public Persona createPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Integer id) {
    personaRepository.deleteById(id);
    }

    @Override
    public Optional<Persona> getPersona(Integer id) {
        return personaRepository.findById(id);
    }
}
