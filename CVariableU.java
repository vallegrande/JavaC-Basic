package EstructurasC;

import java.util.Scanner;

public class CVariableU {

	public static void main(String[] args) {
		Scanner dato = new Scanner (System.in);
		
		Double Var[] = new Double[3];	// var1, var2 y aux
		
		System.out.println("Ingrese la Variable 1");
		Var[0] = dato.nextDouble();
		
		System.out.println("Ingrese la Variable 2");
		Var[1] = dato.nextDouble();
		
		System.out.println("El índice 0 y 1 tiene: "+  Var[0] + " y " + Var[1] );
		
		Var[2] = Var[0];
		Var[0] = Var[1];
		Var[1] = Var[2];
		System.out.print("El índice 0 y 1 tiene: "+  Var[0] + " y " + Var[1] );
	}
}
