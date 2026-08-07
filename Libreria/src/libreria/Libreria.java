/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

/**
 *
 * @author SocFA
 */

import java.util.Scanner;
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingrese = new Scanner(System.in);
        
        System.out.println("Calcule el area y circunferencia de un circulo");
        System.out.println("");
        
        System.out.print("Ingrese el radio del circulo: ");
        
        double radio = ingrese.nextDouble();
        System.out.println("");

        double area = Math.PI * Math.pow(radio, 2);
        double circunferencia = 2 * Math.PI * radio;
       

        System.out.println("Area del circulo: " + area);
        System.out.println("");
        
        System.out.println("Circunferencia del circulo: " + circunferencia);
        System.out.println("");

     
    }
}
  

