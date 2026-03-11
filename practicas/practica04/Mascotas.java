/**
 * Descripción: El programa tiene un método constructor por dafault con los datos de un Gato, el programa imrpime los datos de un gato(los del metodo constructor)
 * y de un segundo gato pero a este yo le paso los datos por referencia, a estos los acompaña un metodo comer. Se declara una variable dirección de tipo estatico 
 * y se juega un poco con como funcionan las variables staticas. Al final se crean dos objetos propietario y se vuelve a implementar el contructor por default y 
 * pasar valores por referencia. 
 * Autores: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 */

public class Mascotas {
    public static void main(String[] args) {

        Gatito.mensaje();
        Gatito gatito01 = new Gatito();
        System.out.println("El nombre del gatito01 es: "+gatito01.nombre+" ");
        System.out.println("El color del gatito01 es: "+gatito01.color+" ");
        System.out.println("La raza del gatitio01 es: "+gatito01.raza+" ");
        System.out.println("La dirección del gatitio01 es: "+gatito01.dirección+" ");
        System.out.println("La comida fav del gatitio01 es: "+gatito01.comidafv+" ");
        gatito01.comer();

        Gatito gatito02 = new Gatito("Luna", "Blanco", "Persa", "Calle Principal", "Atún");
        System.out.println(); 
        System.out.println("El nombre del gatito02 es: "+gatito02.nombre+" ");
        System.out.println("El color del gatito02 es: "+gatito02.color+" ");
        System.out.println("La raza del gatitio02 es: "+gatito02.raza+" ");
        System.out.println("La dirección del gatitio02 es: "+gatito02.dirección+" ");
        System.out.println("La comida fav del gatitio02 es: "+gatito02.comidafv+" ");
        gatito02.comer();

        System.out.println();
        gatito01.dirección = "Calle libertad";
        System.out.println("La dirección del gatitio01 es: "+gatito01.dirección+" ");
        System.out.println("La dirección del gatitio02 es: "+gatito02.dirección+" ");
        //Como la variable dirección es estatica al cambiarla en un objeto, se cambia en todos los demas.

        //Al hacer un método estatico, le puedo mandar hablar con el nombre de la clase y sin necesidad de crear un objeto de este tipo.
        //Con los metodos normales necesito crear un objeto de ese tipo para usar los metodos. 
        
        System.out.println();
        PropietarioGatito propietario01 = new PropietarioGatito(); 
        System.out.println("El nombre del propietario01 es: "+propietario01.nombre+" "); 

        PropietarioGatito propietario02 = new PropietarioGatito("Maria");
        System.out.println("El nombre del propietario02 es: "+propietario02.nombre+" "); 

    }
}
