/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excep3;

import excep3.entidades.Division;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Excep3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese 2 numeros");
        String num = leer.next();
        String num2 = leer.next();

        Division d = new Division();
        d.dividirnumeros(num, num2);

    }

}
