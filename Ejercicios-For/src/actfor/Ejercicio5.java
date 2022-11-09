package actfor;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Creo la variable contador, que será incrementada. La variable suma, guardará un resultado, al igual que media
		int contador=0, suma = 0, media=0;
		
		//Creamos el Scanner para leer por teclado 
		Scanner sc = new Scanner (System.in);
		
		//Incrementa contador en 1 mientras sea menor a 10
		for(int numero=0; contador<10; contador++ ) {
			
			//Le pedimos al usuario que introduzca 10 números
			System.out.println("Introduce los números: ");
			
			//Declaramos la variable numero. Recoge el dato introducido por el usuario
			numero=sc.nextInt();
			
			//Declaramos la variable suma. Recogerá el resultado de la suma de todos los números introducidos
			suma+=numero;	
		}
		
		//Declaramos la variable media. Recogerá el resultado de dividir el resultado de suma entre el número de números introducidos
		media=suma/contador;
		
		//Mostramos la media de los números
		System.out.println("La media de sus números es de: " + media);
		
		//Cerramos el Scanner
		sc.close();

	}

}
