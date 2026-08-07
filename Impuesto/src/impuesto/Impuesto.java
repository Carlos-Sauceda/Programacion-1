/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impuesto;

/**
 *
 * @author SocFA
 */
import java.util.Scanner;
public class Impuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       

        Scanner ingrese = new Scanner(System.in);
        
        System.out.println("Calcule el interes simple e un prestamo");
        System.out.println("");

        // Solicitar datos al usuario
        System.out.print("Ingrese el capital inicial: ");
        double inversioninicial = ingrese.nextDouble();
        System.out.println("");

        System.out.print("Ingrese la tasa de interes anual (%): ");
        int tasa = ingrese.nextInt();
        System.out.println("");

        System.out.print("Ingrese el tiempo en anhos: ");
        int tiempo = ingrese.nextInt();
        System.out.println("");

        // Calcular el interés simple
        double interes = (inversioninicial * tasa * tiempo) / 100;
        System.out.println("");

        // Mostrar resultado
        System.out.println("El interes simple generado es: " + interes);

   
    }
}
