package actfor;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Creo la variable multiplo. Constante, guardará siempre 7.
		final int multiplo=7;
		
		//Incrementa contador en 1 a partir de 7, siempre hasta un menor que 100. Hasta 99
		for(int contador = 7; contador<100; contador++) {
			
			//Si el resto de la división de contador entre 7 es igual a 0, imprime contador
			if(contador%multiplo==0) {
				System.out.println(contador);
			}
		}

	}

}
