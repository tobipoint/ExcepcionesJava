/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excep1;

import excep1.entidades.Persona;
import excep1.servicio.personaServicio;

/**
 *
 * @author Usuario
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        personaServicio ps = new personaServicio();
        Persona p1 = ps.crearPersona();
        ps.mayorEdad(p1);
        

        
    }
    
}
