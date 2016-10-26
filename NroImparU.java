package ConceptosBasicos;

import java.util.Scanner;

public class NroImparU {

	public static void main(String[] args) {
		// LLenar por teclado los N nros. impares en un Array Unidimensional
		System.out.println("Ingrese la cantidad de elementos");
		Scanner leer = new Scanner(System.in);
		int Impar[] = new int[leer.nextInt()];	// tamaño del Array
		
		int k = -1;				
		for(int j = 1; j<= Impar.length; j++){ // length: cantidad de elementos
			k+=2;			// empieza con 1
			Impar[j-1] = k;	// le paso 1 al índice 0		
			System.out.println(Impar[j-1]);	// empiezo desde el índice 0
		}
		leer.close();
	}
}
