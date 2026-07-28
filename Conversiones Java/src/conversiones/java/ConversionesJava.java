/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones.java;

import java.util.Scanner;

/**
 * Desarrollar un algoritmo que me permite convertir valores de longitud
 * de acuerdo a la base que se tenga
 * Pulgadas - Centrimetos
 * Kilometros - Millas
 * Grados Celsius a Grados Farenheit
 * 
 * 
 * @author SocFA
 */
public class ConversionesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        //Declara Variables
        int pulgada = 0;
        double resultadoCM = 0;
        double kilometros = 100;
        double millas = 0; 
        double gcelsius = 0;
        double gfarenheit = 0;
        
        System.out.println("Tenemos 5 pulgadas");
        System.out.println("Cuanto es en centrimetro?");
        
        pulgada = 5; 
        resultadoCM = 5 * 2.54;
        System.out.printf("%d pulgadas es equivalente a %.2f cm", pulgada, resultadoCM);
        
        pulgada = 12; 
        resultadoCM = pulgada * 2.54;
        System.out.printf("\n%.2f cm es equivalente a %d pulgadas", resultadoCM, pulgada);
        
        System.out.println("\n Dime cuantos kilometros son?");
        kilometros = teclado.nextDouble();
        millas = kilometros / 1.6;
        System.out.printf("%.2f kilometros es = a %.3f millas",kilometros,millas);
        
        System.out.println("\n% Dime cuantos grados Celsius son?");
        gcelsius = teclado.nextDouble();
        gfarenheit = (gcelsius * 1.8) + 32;
        System.out.printf("%.2f Grados Celsius es = a %.3f Grados Farenheit",gcelsius,gfarenheit);
    }
    
}
