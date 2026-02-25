import java.util.Scanner;
public class Operaciones2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        float num1, num2, suma, resta, multiplicacion, division; 
        String operacion; 

        System.out.println("Ingrese el primer número"); 
        num1 = entrada.nextFloat();
        System.out.println("Ingrese el segundo número"); 
        num2 = entrada.nextFloat();  
        System.out.println("¿Qué operación necesitas hacer?");
        operacion = entrada.next(); 

        if (operacion.equalsIgnoreCase("suma")){
            suma = num1 + num2; 
            System.out.println("El resultado es: "+suma+" "); 
        } else 
            if(operacion.equalsIgnoreCase("resta")){
                resta = num1 - num2; 
                System.out.println("El resultado es: "+resta+" "); 
            } else
                if (operacion.equalsIgnoreCase("multiplicacion")){
                    multiplicacion = num1 * num2;
                    System.out.println("El resultado es : "+multiplicacion+" ");
                } else
                    if (operacion.equalsIgnoreCase("division")){
                        if (num2 != 0){
                            division = num1 / num2;
                            System.out.println("El resultado es : "+division+" ");
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                    } else
                        System.out.println("Operación no valida"); 

                    entrada.close();   
    }
}