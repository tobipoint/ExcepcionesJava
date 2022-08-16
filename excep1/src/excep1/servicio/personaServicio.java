/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excep1.servicio;

import excep1.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class personaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p1 = new Persona();

        System.out.println("ingrese su nombre");
        p1.setNombre(leer.next());

        System.out.println("ingrese su apellido");
        p1.setApellido(leer.next());

        return p1;
    }

    public void mayorEdad(Persona p1) {
        try {
            System.out.println("ingrese su edad");
            p1.setEdad(leer.nextInt());

            if ((p1.getEdad() >= 18)) {
                System.out.println("eres mayor de edad");
            } else {
                System.out.println("eres menor de edad");
            }
        } catch (Exception e) {
            System.out.println("la edad no es valida");

        }
    }

}
