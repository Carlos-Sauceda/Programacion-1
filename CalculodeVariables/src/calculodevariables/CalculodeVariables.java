/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculodevariables;

/**
 *
 * @author SocFA
 */
import java.util.Scanner;
        
public class CalculodeVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        //Calculo del Area y Perimetro de un Rectangulo
        
        //Variables
        //Base
        //Altura
        //Area
        //Perimetro
       
        System.out.println("Calculo del area y perimetro de un rectangulo");
         
        System.out.print("Ingrese la base del rectangulo: ");
        double base = entrada.nextDouble();
        
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = entrada.nextDouble();
        
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        
       
        System.out.println("Area del rectangulo: " + area);
        System.out.println("Perimetro del rectangulo: " + perimetro); 
        
    }
   
}
