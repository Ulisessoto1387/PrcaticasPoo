/**
 * Clase que importa las clases PececitoEmpaquetado, PerritoEmpaquetado y junto a la clase Gatito, crea objetos y los utiliza. 
 * @author: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 * @version: 1.0
*/

import mx.unam.ingenieria.mascotas.PececitoEmpaquetado;
import mx.unam.ingenieria.mascotas.PerritoEmpaquetado;
public class PruebaMascotas {
    public static void main(String[] args){
        Gatito gato01 = new Gatito("Gris", "2 años");
        PececitoEmpaquetado pez01 = new PececitoEmpaquetado("Negro", "Piedra");
        PerritoEmpaquetado perro01 = new PerritoEmpaquetado("Drako", "Cane corso", "Gris");

        System.out.println("El gatito es de color: "+gato01.getColor()+" y tiene: "+gato01.getEdad()+" ");
        gato01.ronronear();

        System.out.println("El pez es de color: "+pez01.color+" y es un pez: "+pez01.tipoPez+" "); 
        pez01.nadar(); 

        System.out.println("El perro se llama: "+perro01.nombre+" de raza: "+perro01.raza+" y es de color: "+perro01.color+" ");
        perro01.ladrar(); 
        System.out.println("Ladrar n veces: ");
        perro01.ladrar(5); 

        
    }
}