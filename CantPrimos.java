package ConceptosBasicos;

import java.util.Scanner; 

public class CantPrimos {
	public static void main (String args[]){
		int np, cp, sp, cd;		// np: nro. primo , cp: cantidad de primo , sp: suma de primos , cd: cantidad de divisores
		np=1;	
		cp=cd=sp=0;
		System.out.println("Ingrese la cantidad de primos");	// pedimos por teclado		
		Scanner leer=new Scanner(System.in);					// visualizamos la pantalla de ingreso
		int nro = leer.nextInt();
		
		while (cp <nro){
			np++;
			cd=0;
			for (int i=1; i<=np;i++){
				if (np % i==0) cd++;
			}
			if (cd == 2){
				cp++;
				sp+= np;			
			}
			
		}
		System.out.println("La suma es : " + sp);
		leer.close();
	}
}
