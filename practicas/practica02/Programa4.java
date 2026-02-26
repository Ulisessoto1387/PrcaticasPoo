/**
 * Descripción: El programa te pide un total de 5 calificaciones, y te imprime el promedio de estas. 
 * Autores: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 */

import java.util.Scanner; 
public class Programa4 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in); 
        Float[] calificaciones = new Float[5]; 
        Float suma = 0f,promedio = 0f; 

        System.out.println("Dame tus 5 calificaciones: ");
        for (int i = 0; i < 5; i++){
            System.out.println("Calificaciones "+(i+1)+": "); 
            calificaciones[i] = entrada.nextFloat(); 
            suma += calificaciones[i]; 
            promedio = suma/5;  }

            System.out.println("El promedio de las califiaciones es: "+promedio+" "); 
            
        entrada.close(); 
    }
}