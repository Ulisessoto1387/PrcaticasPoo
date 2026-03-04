import java.util.Scanner;
import java.util.ArrayList;

public class EjemploArrayListPeliculas{
	public static void main(String[] args) {
		/** Se declara un ArrayList para almacenar objetos de tipo Película */
		ArrayList<Pelicula> playListPeliculas = new ArrayList<Pelicula>();
		String otraPelicula;
		Scanner entrada = new Scanner(System.in);
		int numPeliPorVer = 0;
		Pelicula peliculaPorVer;

		
		System.out.printf("\n\t************ Ingrese los datos las películas de la playlist ************\n");
		do{
			Pelicula unaPeli = new Pelicula();	//En cada iteración del ciclo while
												//se crea un nuevo objeto de tipo Pelicula
												//y se almacena en la variable de tipo
												//referencia unaPeli

			System.out.printf("\nNombre: ");
			unaPeli.nombre = entrada.nextLine();
			System.out.printf("\nAño: ");
			unaPeli.año = entrada.nextInt();
			entrada.nextLine(); //Esta línea tiene como fin eliminar caracteres
								//basura (saltos de línea) que se hayan quedado
								//almacenados en el buffer del teclado.

			System.out.printf("\nSinópsis: ");
			unaPeli.sinopsis = entrada.nextLine();
			System.out.printf("\nDuración en horas: ");
			unaPeli.duracionEnHoras = entrada.nextFloat();
			playListPeliculas.add(unaPeli);		//Se agrega al arraylist el objeto creado
												//previamente.

			entrada.nextLine(); //Esta línea tiene como fin eliminar caracteres
								//basura (saltos de línea) que se hayan quedado
								//almacenados en el buffer del teclado.

			System.out.printf("\n¿Quiere agregar otra película? ");
			otraPelicula = entrada.nextLine();
			System.out.println();

		}while(otraPelicula.equalsIgnoreCase("si"));


		System.out.printf("\n\t************ Las peliculas de la playlist son las siguientes ************\n");

		for(Pelicula laPeliActual: playListPeliculas){
			System.out.printf("%d. ", playListPeliculas.indexOf(laPeliActual));
			System.out.println(laPeliActual.nombre);	
		}

		System.out.printf("\n\t************ ¿Qué número de película desea ver: ************\n");
		numPeliPorVer = entrada.nextInt();
		peliculaPorVer = playListPeliculas.get(numPeliPorVer);
		System.out.println("Nombre: "+peliculaPorVer.nombre);
		System.out.println("Año: "+peliculaPorVer.año);
		System.out.println("Sinopsis: "+peliculaPorVer.sinopsis);
		System.out.println("Duracion: "+peliculaPorVer.duracionEnHoras);
	}
}