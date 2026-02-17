import java.util.Scanner; 
public class Operaciones {
    public static void main (String[] args) {
        float num1 = 0f;
        float num2 = 0f;
        float suma,resta,mul,div,residuo,raiz,redondeo,dobleredondeo;  
        
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

    }
}