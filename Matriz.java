package ConceptosBasicos;

public class Matriz {

	public static void main(String[] args) {
	    int[][] MiMatriz = new int[4][4];
	    int v = 2;
		for (int f = 0 ; f <= MiMatriz.length; f++){			
			for ( int c = 0 ; c <= 3; c++ ){
				MiMatriz [f][c] = v; 
				System.out.print(MiMatriz[f][c] + "  ");
				v = v+2;
			}
			System.out.println();
		}
		
	}
}

// Giancarlo Valencia Sotomayor