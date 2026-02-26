/**
 * Descripción: El programa te pide que ingreses hasta 10 valores de tipo flotante, ya que los tiene hace una suma de 
 * estoss mismos, luego selecciona solo los valores que son múltiplos de 3  y hace esta suma por separado.   
 * Autores: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 */

import java.util.Scanner;
public class Programa2 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in); 
        int cantidad;
        float suma = 0, sumaMultiplos = 0;  
        float[] valores = new float[10]; 

        System.out.println("Puedes ingresar hasta 10 valores"); 
        System.out.println("¿Cuántos vas a ingresar?"); 
        cantidad = entrada.nextInt(); 

        if (cantidad < 11){
             for (int i = 0; i < cantidad; i++){
            System.out.println("Ingresar el valor "+(i+1)+": ");
            valores[i] = entrada.nextFloat(); }
            
            System.out.println("Suma de valores ingresados: "); 
            for (int i = 0; i < cantidad; i++){
            suma += valores[i]; }
            System.out.println("El resultado de la suma es: "+suma+" ");

            System.out.println("Suma de valores ingresados multiplos de 3: "); 
            for (int i = 0; i < cantidad; i++){
                if (valores[i] % 3 == 0){
                    sumaMultiplos += valores[i];}  }
                    System.out.println("El resultado de la suma es: "+sumaMultiplos+" ");

        } else {
            System.out.println("No puedes ingresar más de 10 valores.");
        }


        entrada.close();
    }
}
