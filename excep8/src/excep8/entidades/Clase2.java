/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excep8.entidades;

/**
 *
 * @author Usuario
 */
public class Clase2 {

    public  int metodo() {
        int valor = 0;
        System.out.println("----------CLALSE 2---------");
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try :" + valor);

        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor final del catch  :" + valor);

        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }

        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);

        return valor;
    }

}
