/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorunidades;

import java.util.Scanner;

/**
 *
 * @author SocFA
 */
public class Conversorunidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Seleccione opcion de conversion");
        do {
            System.out.println("1) Metros a Pies");
            System.out.println("2) Kilogramos a Libras");
            System.out.println("3) Centimetros a Pulgadas");
            System.out.println("4) Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    double metros = sc.nextDouble();
                    if (metros >= 0) {
                        System.out.println(metros * 3.28);
                    } else {
                        System.out.println("Error");
                    }
                    break;

                case 2:
                    double kilos = sc.nextDouble();
                    if (kilos >= 0) {
                        System.out.println(kilos * 2.20);
                    } else {
                        System.out.println("Error");
                    }
                    break;

                case 3:
                    double centimetros = sc.nextDouble();
                    if (centimetros >= 0) {
                        System.out.println(centimetros * 0.39);
                    } else {
                        System.out.println("Error");
                    }
                    break;   
            }
        } while (opcion != 4);
    }
}
