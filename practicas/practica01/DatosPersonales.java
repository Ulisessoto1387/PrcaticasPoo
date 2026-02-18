 /**
  * Descripción: El programa te pide un par de datos personales para despues imrpimirlos dando 
  * como una narración de una tercera persona  
  * Autores: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
  */

import java.util.Scanner;
public class DatosPersonales {
    public static void main (String[] args) {
        int edad = 0; 
        float estatura = 0f; 
        String nombre; 
        char letrafav; 
        long segundosvividos = 0;

    Scanner entrada = new Scanner(System.in); 
    System.out.println("Ingresa tu edad: "); 
    edad = entrada.nextInt(); 
    System.out.println("Ingresa tu estatura en metros: "); 
    estatura = entrada.nextFloat(); 
    entrada.nextLine(); 
    System.out.println("Ingresa tu nombre completo: ");
    nombre = entrada.nextLine(); 
    System.out.println("Ingresa tu letra fav: "); 
    letrafav = entrada.nextLine().charAt(0);
    System.out.println("Segundos que has vivido: "); 
    segundosvividos = entrada.nextLong();  

    System.out.println("");
    System.out.println("Hola "+nombre+" "); 
    System.out.println("Mides:"+estatura+" metros y tu letra favorita es:"+letrafav+" "); 
    System.out.println("Hasta el momento has vivido:"+segundosvividos+" segundos");

    }
}