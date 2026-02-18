 /**
  * Descripción:Le pide al usuario un par de números/cantidades para con estos realizar distintas operaciones
  * Autores: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
  */

import java.util.Scanner; 
public class Operaciones {
    public static void main (String[] args) {
        float num1 = 0f;
        float num2 = 0f;
        float suma,resta,mul,div,residuo;
        double raiz1,raiz2,redondeo1,redondeo2,expo;  
        
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Dame un número: "); 
        num1 = entrada.nextFloat(); 
        System.out.println("Dame un segundo número: "); 
        num2 = entrada.nextFloat(); 

        suma = num1+num2; 
        System.out.println("El resultado de la suma es: "+suma+" "); 

        resta = num1-num2; 
        System.out.println("El resultado de la resta es: "+resta+" "); 

        mul = num1*num2; 
        System.out.println("El resultado de la multiplicación es: "+mul+" ");

        div = num1/num2; 
        System.out.println("El resultado de la div es: "+div+" ");

        residuo = num1%num2; 
        System.out.println("El residuo de la div es: "+residuo+" ");

        raiz1 = Math.sqrt(num1); 
         raiz2 = Math.sqrt(num2); 
        System.out.println("La raíz cuadrdada del primer núm es: "+raiz1+" y del segundo núm es: "+raiz2+" "); 

        redondeo1 = Math.ceil(num1); 
        redondeo2 = Math.ceil(num2);
        System.out.println("El redondeo del primer núm es: "+redondeo1+" y del segundo núm es: "+redondeo2+" "); 

        expo = Math.pow(redondeo1, redondeo2); 
        System.out.println("El resultado de la potencia es: "+expo+" "); 

    }
}