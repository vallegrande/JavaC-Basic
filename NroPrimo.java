package ConceptosBasicos;

import java.util.Scanner;

public class NroPrimo {

	public static void main(String[] args) {
		System.out.println("Ingrese un número");
		Scanner leer = new Scanner(System.in);
		int nro = leer.nextInt();
		int cd=0;
		for (int i=1; i == nro ; i++){
			if (nro % i==0)	cd++;
		}
		if (cd == 2){
			System.out.println("Es primo");
		} else{
			System.out.println("No es primo");
		}
		leer.close();
	}
	
}
