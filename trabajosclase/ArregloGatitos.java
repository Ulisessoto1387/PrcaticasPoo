import java.util.Scanner;
public class ArregloGatitos {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in); 

        Gatito[] gatitos = new Gatito[3];
        for (int i = 0; i < 3; i++){
            gatitos[i] = new Gatito();
            System.out.println("¿De que color son los ojos del gatito?"); 
            gatitos[i].colorOjos = entrada.nextLine(); 
            System.out.println("¿Cuantas veces toma leche al día?");
            gatitos[i].vecesTomaLeche = entrada.nextInt();
            entrada.nextLine();  }

            for(int j = 0; j < 3; j++){
                System.out.println("El gatito "+(j+1)+" "); 
                System.out.println("El color de ojos es: "+gatitos[j].colorOjos+" ");
                System.out.println("Toma Leche "+gatitos[j].vecesTomaLeche+" veces al día. ");
                gatitos[j].beberLeche();  } 

    entrada.close(); 

    }
}
