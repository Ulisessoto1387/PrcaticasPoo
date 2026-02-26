/**
 * Descripción: El programa te pide que ingreses dos números y a continuación que opción de las operaciones
 * posiblres quieres realizar para que lo haga. 
 * Autores: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 */

import java.util.Scanner; 
public class Operaciones1 {
    public static void  main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        float num1, num2, suma,resta,multiplicacion,division;
        char opcion;  
        
        System.out.println("Ingrese el primer número. "); 
        num1 = entrada.nextFloat(); 
        System.out.println("Ingrese el segundo número. "); 
        num2 = entrada.nextFloat();

        System.out.println("a) Suma"); 
        System.out.println("b) Resta"); 
        System.out.println("c) Multiplicacion"); 
        System.out.println("d) Division");
        opcion = entrada.next().charAt(0); 
        
        switch (opcion){
            case 'a':
                case 'A':
                    suma = num1 + num2; 
                    System.out.println("El resultado es: "+suma+" ");
                    break; 

            case 'b':
                case 'B' :
                    resta = num1 - num2; 
                    System.out.println("El resultado es: "+resta+" ");
                    break; 

            case 'c':
                case 'C':
                    multiplicacion = num1 * num2; 
                    System.out.println("El resultado es: "+multiplicacion+" ");
                    break; 

            case 'd':
                case 'D':
                    division = num1 / num2; 
                    System.out.println("El resultado es: "+division+" ");
                    break; 

            default:
                System.out.println("No sabes leer");
        }
    }
}
