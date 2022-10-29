
package com.myportfolio.fsg.Interface;

import com.myportfolio.fsg.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto tipo persona
    public void savePersona(Persona persona);
    
    //eliminar objeto(usuario) buscado por id
    
    public void deletePersona(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);   
}
