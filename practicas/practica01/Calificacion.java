/**
 * Descripción: El programa pide al usuario una calificación y la multiplica 
 * por 2.5 para obtener una nueva calificación. 
 * Autores: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 */

import java.util.Scanner;
public class Calificacion
{
	public static void main(String[] args) {
	    float calificacion = 0;
	    
	    Scanner entrada = new Scanner(System.in);
		System.out.println("Dame una calificacion");
		calificacion = entrada.nextFloat();
		System.out.println("Tu calificacion es de: "+calificacion);
		calificacion *= 2.5;
		System.out.println("Tu nueva calificacion es de: "+calificacion);
	}
}
