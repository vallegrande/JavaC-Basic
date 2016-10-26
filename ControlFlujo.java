package ConceptosBasicos;

public class ControlFlujo {

	public static void main(String[] args) {
		// if - else   : obtener el nro. mayor
		/*
		int a = 5;
		int b = 20;
		if (a > b) {
			System.out.println("a es mayor");
		}else if (b == a){
			System.out.println("a y b son iguales");
		}else{
			System.out.println("a no es el mayor y no son iguales");
		}
		
		// switch
		int c = 1009;
		switch (c){
			case 1005:
			System.out.println("c es 1005");
			break;
			case 1006:
			System.out.println("c es 1006");
			break;
			case 1007:
			System.out.println("c es 1007");
			break;
			case 1008:
			System.out.println("c es 1008");
			break;
			case 1009:
			System.out.println("c es 1009");
			break;
			default:
			System.out.println("c es otro valor");
			break;
		}
		*/
		
		/*
		// While
		int a =1;
		while (a <= 5) {
			System.out.println("a : " + a);
			a++;
		} 
		
		// For
		for (int i = 1; i <= 5; i++ ){
			System.out.println("i : " + i);
		}
		*/
		
		// Arreglo
		int[] MiArreglo = new int[5];		
		MiArreglo[0]=5;
		MiArreglo[1]=5;
		MiArreglo[2]=5;
		MiArreglo[3]=5;
		MiArreglo[4]=5;  
		for (int j = 0; j <= MiArreglo.length; j++ ){
			MiArreglo[j] = j * 6;
			System.out.println("MiArreglo[" +j+ "] :" + MiArreglo[j]);
		}
		
		// for each  (sólo datos de tipo entero)
		
		for (int i : MiArreglo){
			System.out.println(i);
		}
	
	}

}
