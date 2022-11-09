package actfor;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args){
		//Creo la variable numero
		int numero;
		
		//Creamos el Scanner para leer por teclado
		Scanner sc = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca un número 
		System.out.println("Introduce el número hasta el que quieras contar: ");
		
		//Declaramos la variable numero. Guardando el valor introducido por el usuario
		numero=sc.nextInt();
		
		//Incrementa contador en 1, siempre que contador sea menor o igual a numero. Imprime contador
		for(int contador = 1; contador<=numero; contador++) {
			System.out.println(contador);
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
