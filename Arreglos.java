package ConceptosBasicos;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] MiArregloInt = new int[5];	// declarando y asignando indices de 0 - 4
		MiArregloInt[0] = 56;
		MiArregloInt[1] = 1;
		MiArregloInt[2] = 25;		
		MiArregloInt[3] = 0;
		MiArregloInt[4] = 13;
		//System.out.println(MiArregloInt[2]);
		//System.out.println(MiArregloInt[4]);
		
		double[][] MiArregloDouble2D = new double[3][3]; // una matriz
		MiArregloDouble2D [1][2] = 4;
		MiArregloDouble2D [0][2] = 56.7;
		MiArregloDouble2D [2][1] = 16.34;
		MiArregloDouble2D [0][0] = 987.454;
		System.out.println(MiArregloDouble2D[1][2]);
		System.out.println(MiArregloDouble2D[2][1]);
		System.out.println(MiArregloDouble2D[0][0]);
		
		char [][][] MiArregloChar3D = new char[2][2][2];
		MiArregloChar3D [1][2][4] = 'c';
		MiArregloChar3D [0][2][1] = 'b';
		System.out.println(MiArregloChar3D[0][2][1]);
	}
}
