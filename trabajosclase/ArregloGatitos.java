import java.util.Scanner;
public class ArregloGatitos {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in); 

        Gatito[] gatitos = new Gatito[3];
        for (int i = 0; i <3; i++){
            System.out.println("¿De que color son los ojos del gatito?"); 
            gatitos[i].colorOjos = entrada.nextLine(); 
            System.out.println("¿Cuantas veces toma leche al día?");
            gatitos[i].vecesTomaLeche = entrada.nextInt(); 
            gatitos[i].beberLeche(); }

            for(int = i; i < 3; i++){
                System.out.println("El gatito "+(i+1)+" "); 
                System.out.println("El color de ojos es: "+gatitos[i].colorOjos+" ");
                System.out.println("Toma Leche "+gatitos[i].vecesTomaLeche()+" veces al día. "); 
            }

    entrada.close(); 

    }
}