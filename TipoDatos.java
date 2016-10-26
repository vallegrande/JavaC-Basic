package ConceptosBasicos;

public class TipoDatos {

	public static void main(String[] args) {
		//Variables				
				byte a = 127;   	// 2 bytes -128 a 127
				short b = 32766; 	// 2 bytes -32768 a 32767
				int c=45123;   		//	variable entera
				float d=45F;     	//	decimal
				double e = 45645645645645646546444654.4444546554; //double	    
				System.out.print("edad es:" + d);
					   			
				int x =1;
				int w = 1;
				String y = "1";
				String z = "1";	     
				System.out.println(x + w);			// 2
				System.out.println( y + z);			// 11	
				
				x = 5;
				
				//int y = 15;
				//int z = 35; // si tuviera 97 elementos ++++
				
				// Arreglo Unidimensional
				int k[] = new int[100];
				k[0] = 5;
				k[4] = 25;
				System.out.println(k[0]);
				
				// Arreglo Bidimensional: Filas x Columnas
				double Arreglo2D[][] = new double[5][10];
				Arreglo2D[1][5] = 78.5;
				Arreglo2D[3][4] = 89.78;
				Arreglo2D[4][9] = 78945361231.98;
				
				System.out.println(Arreglo2D[3][4]);
				System.out.println(Arreglo2D[4][9]);
				
				// Arreglo Tridimensional: Largo x Ancho x Profundidad
//				double Arreglo3D [][][] = new double[4][4][4];
				char Arreglo3D [][][] = new char[4][4][4];
//				Arreglo3D[0][0][0] = 456;
//				Arreglo3D[1][2][3] = 78;
				Arreglo3D[0][0][0] = 'J';
				Arreglo3D[1][2][3] = 'A';
				System.out.println(Arreglo3D[0][0][0]);
				System.out.println(Arreglo3D[1][2][3]);
				
				String Arreglo3D2 [][][] = new String[4][4][4];
				Arreglo3D2[2][2][2] = "Giancarlo VS lo máximo";
				System.out.println(Arreglo3D2[2][2][2]);

	}

}
