import java.util.Scanner; 
import java.util.Hashtable; 

public class MenuPokemones {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); 
        Hashtable<String, Pokemones> pokedex = new Hashtable<>();
        String apodo; 
        String otroPokemon;
        String elegido;
        int contador=1;   

        System.out.println("---Menú de pokemones---"); 
        do{
            Pokemones pokemon = new Pokemones(); 
            System.out.println();
            System.out.println("Ingrese el nombre del pokemon: "); 
            pokemon.nombre = entrada.nextLine(); 
            System.out.println("Dame un apodo para que sea el identificador"); 
            apodo = entrada.nextLine(); 
            System.out.println("Ingrese el ataque principal de "+pokemon.nombre+": "); 
            pokemon.ataquePrincipal = entrada.nextLine(); 
            System.out.println("Ingrese la evolución de "+pokemon.nombre+": "); 
            pokemon.evolución = entrada.nextLine();
            pokedex.put(apodo, pokemon);
            
            System.out.println();
            System.out.println("¿Quieres agregar otro pokemon?");
            otroPokemon = entrada.nextLine(); 
        }while(otroPokemon.equalsIgnoreCase("si"));
        
        System.out.println();
        entrada.nextLine();
        System.out.println("---Pokemones registrados---");
        for(String apodoActual: pokedex.keySet()){
            System.out.println(" "+contador+". "+apodoActual+" ");
            contador++;
        }

        System.out.println();
        System.out.println("Elige el pokemon que quieres consultar:");
        elegido = entrada.nextLine();
        Pokemones encontrado = pokedex.get(elegido);

        if(encontrado != null) {
            System.out.println();
        System.out.println("---Datos de "+elegido+"---");
        System.out.println("Nombre: "+encontrado.nombre+" ");
        System.out.println("Ataque: "+encontrado.ataquePrincipal+" ");
        System.out.println("Evolución: "+encontrado.evolución+" ");
        } else {
            System.out.println("Ese apodo no existe en la Pokedex.");
        }

    }
}