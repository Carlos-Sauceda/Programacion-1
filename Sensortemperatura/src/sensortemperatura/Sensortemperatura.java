/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sensortemperatura;

import java.util.Scanner;

/**
 *
 * @author SocFA
 */
public class Sensortemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        double suma = 0;
        int contador = 0;
        double max = 56;
        double min = -999;

        System.out.println("Ingrese la temperatura en Grados Celsius:");
        double temp = sc.nextDouble();  
        while (temp != -999) {          
            if (temp >= -273.15) {      
                suma = suma + temp;
                contador = contador + 1;
                if (temp > max) max = temp;
                if (temp < min) min = temp;
            } else {
                System.out.println("Error");
            }
            temp = sc.nextDouble();    
        }

        if (contador > 0) {
            System.out.println("Promedio: " + (suma / contador));
            System.out.println("Diferencia: " + (max - min));
    }
  }  
}
