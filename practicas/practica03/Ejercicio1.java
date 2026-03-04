import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        String frase; 

        System.out.println("Escribe una frase de hasta 50 caracteres: ");
            String frase = entrada.nextLine();

        while (frase.length() > 50) {
            System.out.println("La frase supera lo pedidio.");
            System.out.println("Dame otra cadena");
            String frase = entrada.nextLine();
        } 
        
        System.out.println("Esta bien, comenzamos a trabajar. ");
        System.out.println("La frase tiene "+frase.length()+" caracteres.");
        System.out.println("La frase original es: "+frase+" ");
        System.out.println("La frase original sin espacios: "+frase.replace(" ", "")+" ");
        System.out.println("La frase original en mayúsculas: "+frase.toUpperCase()+" ");
        System.out.println("La frase original en minusculas: "+frase.toLowerCase()+" ");
        System.out.println("La frase original reemplazando las a por @: "+frase.replace("a", "@")+" ");
        System.out.println("Las puras vocales de la frase: ");

        System.out.println("El número de posición en la frase en la que aparece la primera letra a: "+frase.indexOf("a")+" ");
        System.out.println("El número de posición en la frase en la que aparece la última letra e: "+frase.lastIndexOf("e")+" ");
        System.out.println("La frase original al revés: ");

        System.out.println("La subcadena que va desde el carácter con posición 3 hasta la posición 8: "+frase.getChars(3,9,frase,0)+" ");
        System.out.println("La subcadena que va desde el carácter 5 hasta el final de la frase: "+frase.getChars(5,frase.length(),frase,0)+" ");
        System.out.println("El carácter que se encuentra en la posición 3: "+frase.charAt(3)+" ");

        
        
       


        




        entrada.close();
    }
}
