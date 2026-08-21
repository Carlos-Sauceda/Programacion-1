/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trayectoriabalistica;

import java.util.Scanner;

/**
 *
 * @author SocFA
 */
public class Trayectoriabalistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la velocidad Inicial: ");
        System.out.print("Velocidad inicial (m/s): ");
        double VelIN = sc.nextDouble();

        System.out.print("Angulo (grados): ");
        double angulo = sc.nextDouble();

        if (VelIN <= 0 || angulo <= 1 || angulo >= 89) {
            System.out.println("Error en los datos");
        } else {
         
            double rad = Math.toRadians(angulo);
            double v0y = VelIN * Math.sin(rad);
            double g = 9.81;

            // Altura máxima teórica
            double hMax = (v0y * v0y) / (2 * g);

            // Ciclo for de 1 a 10
            for (int t = 1; t <= 10; t++) {
                double y = v0y * t - 0.5 * g * t * t;

                if (y < 0) {
                    System.out.println("En t = " + t + "s el proyectil cayo.");
                    break;
                }

                System.out.println("Altura en t = " + t + "s: " + y);

                if (Math.abs(y - hMax) < 0.5) {
                    System.out.println("Maxima altura en t = " + t + "s");
                }
            }
        }
    }
}
        

