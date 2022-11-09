package actfor;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creo la variable numero, dato del usuario. Y la variable constante multiplo
		int numero;
		final int multiplo=3;
		
		//Creamos el Scanner para leer por teclado
		Scanner sc = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca un número
		System.out.println("Introduce el número hasta el que quieras sacar los múltiplos de 3: ");
		
		//Declaramos la varibale numero. Guardará el valor introducido por el usuario
		numero = sc.nextInt();
		
		//Incrementa contador en 1 a partir de 3, siempre hasta un menor que numero
		for(int contador = 3; contador<=numero; contador++) {
			
			//Si el resto de la división de contador entre 3 es igual a 0, imprime contador
			if(contador%multiplo==0) {
				System.out.println(contador);
			}
		}
		
		//Cerramos el Scanner 
		sc.close();

	}

}