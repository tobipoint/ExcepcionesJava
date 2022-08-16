/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excep8;

import excep8.entidades.Clase1;
import excep8.entidades.Clase2;
import excep8.entidades.Clase3;

/**
 *
 * @author Usuario
 */
public class Excep8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase1 c1 = new Clase1();
        Clase2 c2 = new Clase2();
        Clase3 c3 = new Clase3();

//   CLASE 1
        try {
            System.out.println(c1.metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }

        //   CLASE 2
        try {
            System.out.println(c2.metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }

//    CLASE 3
        try {
            System.out.println(c3.metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }

    }

}
