/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excep5.entidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Juego {

    Scanner leer = new Scanner(System.in);

    public void adivinarNumero() {

        int numero = (int) (Math.random() * 501);
        System.out.println(numero);
        int cont = 0;
        int num = 0;
        System.out.println("------intente adivinar el numero aleatorio---------");

        do {
            System.out.println("ingrese un valor numerico");
            try {
                num = leer.nextInt();
                if (num == numero) {
                    System.out.println("felicidades, encontro el numero");
                }
                if (num < numero) {
                    System.out.println("el numero ingresado esta por debajo, apunte mas alto");
                    cont = 1 + cont;
                } else if (num > numero) {
                    System.out.println("valor muy alto, apunte mas bajo");
                    cont = 1 + cont;
                }
            } catch (InputMismatchException e) {
                System.err.println("el numero no es valido");
                leer.nextLine();
                cont = 1 + cont;
            }
        } while (num != numero);

        System.out.println("lo ha intentado " + cont + " veces ");
    }

}
