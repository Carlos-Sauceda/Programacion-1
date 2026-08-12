/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendasoftware;

import java.util.Scanner;

/**
 *
 * @author SocFA
 */
public class TiendaSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        //Solicitar Datos
        System.out.println("Ingrese la edad del cliente: ");
        int edad = sc.nextInt();
        
        System.out.println("Tiene Membresia Premium? (S/N):");
        char membresia = sc.next().toUpperCase().charAt(0);
        
        System.out.println("Ingrese el precio original: ");
        double precioOrg = sc.nextDouble();
        
        double descuento = 0;
        
        if (edad >=18){
            if (edad > 65 || membresia == 'S' ){
                descuento = 0.20;
            }else{
                descuento = 0.10;
            }
        }else{
            if(membresia == 'S' && edad >12){
                descuento = 0.15;
            }else{
                descuento = 0.0;
            }
        }
        double totaldescuento = precioOrg * descuento;
        double preciofinal = precioOrg - totaldescuento;
        
        System.out.println("Descuento Aplicado: " +(descuento*100)+"%");
        System.out.println("Precio Original: Lps. " +precioOrg);
        System.out.println("Total Descuento: Lps. " +totaldescuento);
        System.out.println("Total a Pagar: Lps. " +preciofinal);
        
        
    }//fin string
    
}//fin public class
