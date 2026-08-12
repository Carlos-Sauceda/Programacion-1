/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraaritmetica;

import java.util.Scanner;

/**
 *
 * @author SocFA
 */
public class CalculadoraAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        // Solicitar números
        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = sc.nextInt();

        // Solicitar operación
        System.out.print("Ingrese el operador (+, -, *, /, %): ");
        char operador = sc.next().charAt(0);

        double resultado;

        // Selección de operación
        switch (operador) {
            case '+' -> {
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
            }
            case '-' -> {
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
            }
            case '*' -> {
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
            }
            case '/' -> {
                if (numero2 != 0) {
                    resultado = (double) numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: División entre cero no permitida.");
                }
            }
            case '%' -> {
                if (numero2 != 0) {
                    resultado = numero1 % numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: Módulo con divisor cero no permitido.");
                }
            }
            default -> System.out.println("Operador no reconocido.");
        }
    }
}

