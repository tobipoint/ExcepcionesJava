/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excep2.entidades;

/**
 *
 * @author Usuario
 */
public class Array {

    public int vector[];

    public void llenarvector() {
        vector = new int[5];

        try {
            for (int i = 0; i < 10; i++) {
                vector[i] = (int) (Math.random() * 20);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("no hay tantos lugares disponibles");
        }
    }

}
