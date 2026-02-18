import java.util.Scanner;
public class Mascotas{
    public static void main(String[] args){
        Gatitos gatito01 = new Gatitos();
        String edad,nombre,colorojos; 

        Scanner entrada = new Scanner(System.in); 
        System.out.println("Dame un nombre para el gatito: "); 
        nombre = entrada.nextLine(); 
        System.out.println("Dame una edad para el gatito: "); 
        edad = entrada.nextLine(); 
        System.out.println("Dame un color de ojos para el gatito: "); 
        colorojos = entrada.nextLine(); 

        System.out.println("");
        System.out.println("El nombre del gato es: "+nombre+" tiene "+edad+" años y el color de sus ojos es "+colorojos+" "); 
        System.out.println("Las acciones que realiza el gato: ");
        System.out.println("Maullar");
        gatito01.maullar();
        System.out.println("Ronronear");
        gatito01.ronronear(); 
        gatito01.beberLeche(); 

        System.out.println("  /\\_/\\  ");
        System.out.println(" ( o.o ) ");
        System.out.println("  > ^ <  ");

    }
}