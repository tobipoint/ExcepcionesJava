/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excep3.entidades;

/**
 *
 * @author Usuario
 */
public class Division {

    public void dividirnumeros(String num, String num2) {

        try {
            double a = Integer.parseInt(num);
            double b = Integer.parseInt(num2);
            double division = a / b;
            
            System.out.println("la division da " + division);

        } catch (NumberFormatException e) {
            System.out.println("algun numero no es valido");
            
        } catch (Exception e) {  
            System.out.println("la division no es posible");
        
        }

    }
}