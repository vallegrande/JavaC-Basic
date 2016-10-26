package EstructurasC;

public class SumaU {

	public static void main(String[] args) {
		// creando el Arreglo Unidimensional
		// de tamaño 4
		int Arreglo[] = new int[4];
		
		// Asignando valores a los índices		
		Arreglo[0]= 4;
		Arreglo[1]= 9;
		Arreglo[2]= 15;
		Arreglo[3]= 10;
		
		int suma = 0;
		for(int n=0;n<4;n++){ // 4 elementos
			suma = suma + Arreglo[n];
		}
		System.out.println("La suma es: " + suma);
	}

}
