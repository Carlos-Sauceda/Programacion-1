/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * @author SocFA
 */
//Objetivos
//* Utilizar la estructura de reprticion del ciclo FOR
//* Emplear las constantes en programacion 

public class CicloFOR {

    /**
     * @param args the command line arguments
     /*Desarrollar un algoritmo que permita calcular el procentaje de votantes
     /*(Varones y mujeres) que hay en una cabina.
     /indicar quienes fueron los que mas votaron
*/
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
            1.Variable de control -> Valor Inicial
            2.Condicion -> Limite
            3.Modificador de la V.C. -> Incremento/Decremento
        */
        System.out.println("Ciclo For 1");
        for (int i = 0 ; i < 10 ; i++ ) {
            System.out.printf("Ciclo %d\n",i);
            
        }//Fin de Ciclo FOR
        
        System.out.println("Ciclo For 2");
        for (int i = 2; i < 10; i +=2) {
            System.out.printf("Ciclo %d\n",i);
            
            Scanner input = new Scanner (System.in);
           
            //int numeroVotantes = 10;
            final int NUMEROVOTANTES = 20;
            int numVarones = 0;
            int numMujeres = 0;
            char seleccion = '1';
            
            for (int i = 0; i < NUMEROVOTANTES; i++){
                System.out.println("Genero de Votante");
                System.out.print("V: Varonm / M: Mujer");
                seleccion = input.next().toUpperCase().CharArt(0);
                switch (seleccion) {
                    case 'V' -> {
                        System.out.println("Varon entrando");
                        System.out.println("a la cabina");
                        numVarones++;
                    }
                    case 'M' -> {
                        System.out.println("Mujer entrando");
                        System.out.println("a la cabina");
                        numMujeres++;
                    }
                    default -> System.out.println("Error de Ingreso");
                    }
                }
            }
        }
        
        }//fin de main
            
    }//Fin de Class
    

