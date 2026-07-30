/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadodeclase;

import java.util.Scanner;

/* Se necesita desarrollar un algoritmo que determine si un bote con agua de 500 mL
a. esta arriba de la mitad (Dato Numerico)
b. contiene agua o no (Dato de Caracter)
c. es amigable con el ambniente (Dato de cadena)
*/
/**
 *
 * @author SocFA
 */
public class EstadodeClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        //*
        //Conociendo la Estructura
        //1. Palabra Clave "if" y/o "else"
        //2. EL grupo de instrucciones se encierra entre{}
        //3. NO se usa ";" para los bloques.
        //4. La condicion es una comparacion bajo los siguientes elementos:
            //a. > menor 
           // b. < mayor
           // C. >= menor o igual
           // d. <= mayor o igual
            //e. == igual (uso de 2 signos iguales)
            //f. Distinto (Signos pegados)
            /*
            
            */
            int cantidadagua = 0;
            char respuesta = '@';
            String respuestaambiente = "John Doe";
            System.out.println("El bote es de 500 mL");
            System.out.print("Cuanto liquido dices que contiene?");
            cantidadagua = input.nextInt();
            if (cantidadagua >= 250){
                System.out.println("Si, tiene mas de la mitad");
                System.out.println("Te lo puedes beber!!!");
                System.out.println("No nos quedamos sin nada... hay suficiente");
            }
            input.nextLine(); //Limpieza de Buffer
            System.out.println("");
        System.out.println("El liquido que contiene es H2O?5 (a=si, b=no)");
        respuesta = input.nextLine() .charAt(0);
        if (respuesta == 'a') {
            System.out.println("""
                               Si es agua lo que contiene
                               No es otra cosa... Nada embriagante.!!
                               """);
        }
        else {
            System.out.println("""
                               Uy Uy Uy
                               Que sera?...""");
        }
        
        System.out.printf("\nEse bote que contiene %d mL",cantidadagua);
        System.out.println("\nEs amigable con el ambiente?");
        respuestaambiente = input.nextLine();
        System.out.printf("Dato de Variable: %s" ,respuestaambiente);
        
        System.out.println("Seguro?");
        respuestaambiente = input.nextLine().toUpperCase();
        System.out.printf("Dato de Variable: %s" ,respuestaambiente);
       
        System.out.println("100% Seguro?");
        respuestaambiente = input.nextLine().toLowerCase();
        System.out.printf("Dato de Variable: %s" ,respuestaambiente);
        
        if(respuestaambiente.equals("si")) {
            System.out.println("Es amigable");
        }
            else{
            System.out.println("No es nada amigable");
        }
        //
        
    }
    
}
