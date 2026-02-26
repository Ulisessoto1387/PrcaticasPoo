/**
 * Descripción: El programa te muestra un menú donde puedes elegir comer hasta 4 tipos de pozole distintos, al acabar te 
 * vuelven a ofrecer siempre y cuando no lleves consumido más de $350, al final te muestra la cuenta total.
 * Autores: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 */

import java.util.Scanner;
public class Pozoles {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in); 
        String repetir = "si"; 
        int lim = 320, cuenta = 0; 
        char opcion; 
         
        do {
         System.out.println("A continuacion se le dara el menu."); 
         System.out.println("Todos nuestros pozoles son de cerdo,¿De cual quiere?"); 
         System.out.println("A) Pozole blanco    -$80"); 
         System.out.println("B) Pozole verde.    -$90"); 
         System.out.println("C) Pozole rojo.     -$100"); 
         System.out.println("D) Pozole de camarón -$130"); 
         opcion =  entrada.nextLine().charAt(0);

         switch (opcion){
            case 'A':
                case 'a': 
                System.out.println("Se sirvio pozole blanco."); 
                System.out.println("El cliente se comio su pozole blanco."); 
                cuenta += 80; 
                System.out.println ("La cuenta va en: $ "+cuenta+" ");
                System.out.println("¿Gusta algo más?"); 
                repetir = entrada.nextLine();  
                break; 
                
            case 'B':
                case 'b': 
                System.out.println("Se sirvio pozole verde."); 
                System.out.println("El cliente se comio su pozole verde."); 
                cuenta += 90;
                System.out.println ("La cuenta va en: $ "+cuenta+" ");
                System.out.println("¿Gusta algo más?"); 
                repetir = entrada.nextLine();  
                break; 

            case 'C':
                case 'c':
                System.out.println("Se sirvio pozole rojo."); 
                System.out.println("El cliente se comio su pozole rojo.");
                cuenta += 100;
                System.out.println ("La cuenta va en: $ "+cuenta+" ");
                System.out.println("¿Gusta algo más?"); 
                repetir = entrada.nextLine();   
                break; 

            case 'D':
                case 'd':
                System.out.println("Se sirvio pozole de camaron."); 
                System.out.println("El cliente se comio su pozole de camaron."); 
                cuenta += 130;
                System.out.println ("La cuenta va en: $ "+cuenta+" ");
                System.out.println("¿Gusta algo más?"); 
                repetir = entrada.nextLine();   
                break; 

            default: 
                System.out.println("No sabes leer, eliga de nvo.");
            }

        }while (repetir.equalsIgnoreCase("si") && cuenta < lim);

        System.out.println("La cuenta es de: $ "+cuenta+" "); 
        System.out.println("Gracias por su compra, vuelva pronto");  

    }
}