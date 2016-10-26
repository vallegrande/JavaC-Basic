package EstructurasC;

import java.util.Scanner;

public class Edades {
	public static void main(String[] args) {
		try {
			int rptan;
			rptan=1;
			Scanner lectura = new Scanner(System.in);
			while(rptan == 1){				
				System.out.println("Ingresa tu edad");
				int edad = lectura.nextInt();
				
				if (edad>0 && edad <6) System.out.println("Niño");
				else if(edad>5 && edad < 14) System.out.println("Puber");
				else if(edad>13 && edad < 25) System.out.println("Joven");
				else if(edad>24 && edad < 36) System.out.println("Adolece");
				else if(edad>35 && edad < 51) System.out.println("Adulto");
				else if(edad>50 ) System.out.println("Abuelo");
				
				System.out.println("Deseas continuar? pon 1 para continuar o 2 para salir");
				rptan = lectura.nextInt();	
//				System.out.println(lectura.next());

			}
			lectura.close();	// cierra el objeto lectura			
		} catch (Exception e) {
			System.out.println(e);
		}			
	}
}
