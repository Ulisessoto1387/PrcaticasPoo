import java.util.Scanner;
import java.util.hashtable;

public class Carrera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respuesta, nombre, especie;
        int meta = 20, id = 0; 

        do {
            Hashtable<Integer, Animal> competidores = new Hashtable<Integer, Animal>();
            System.out.println("¡Bienvenido a las carreras");
            System.out.println("Dame el nombre del competidor:");
            nombre = entrada.nextLine();
            System.out.println("Proporcionar la especie del competidor");
            especie = entrada.nextLine();
            id += 1;
            if (especie.equalsIgnoreCase("liebre")){
                Animal liebre01 = new Liebre(id, 0, nombre, "descansando");
                competidores.put(id, liebre01);
            } else if (especie.equalsIgnoreCase("tortuga")){
                Animal tortuga01 = new Tortuga(id, 0, nombre, "descansando");
                competidores.put(id, tortuga01);
            } else if (especie.equalsIgnoreCase("perro")){
                Animal perro01 = new Perro(id, 0, nombre, 3);
                competidores.put(id, perro01);
            } else {
                System.out.println("Esta especie no entra en la carrera");
            }

            System.out.println("");
            System.out.println("¿Quieres agregar otro competidor?");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("");
        System.out.println("Comienza la carrera!!");
        System.out.println("Lista de competidores:");
        for (Integer key: competidores.keyset()){
            System.out.println(" "+competidores.get(key).toString());
        }
        

    }
}