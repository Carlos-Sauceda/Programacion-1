/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promediomateria;

import java.util.Scanner;



/**
 *
 * @author SocFA
 */
public class PromedioMateria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        //Solicitar Datos
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese la calificacion del examen 1:");
        double examen1 = sc.nextDouble();
        
        System.out.println("Ingrese la calificacion del examen 2:");
        double examen2 = sc.nextDouble();
        
        //Calculo del promedio
        double promedio = (examen1 + examen2)/2;
        
            if (promedio>=65) {
                System.out.println(nombre + " esta aprobado, su promedio es:" + promedio);
            } else {
                System.out.println(nombre + " esta reprobado, su promedio es:"+ promedio);
            
        }//fin else
       
    }//Fin string
    
}//fin PromedioMateria*/
