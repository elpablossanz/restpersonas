package com.kreitek.rrhh.rrhhpersonas;

import java.util.List;
import java.util.Optional;

public interface PersonaService {
    List<Persona> getAllPersonas();

    Persona createPersona(Persona nuevaPersona);

    void deletePersona(Integer id);

    Optional<Persona> getPersona(Integer id);
}
