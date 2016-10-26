package ConceptosBasicos;

public class Operadores {

	public static void main(String[] args) {
		// operadores + - * / %
		int a = 2 ;
		int b = 5;
		int c = 0;
		
		// Suma
		c = a + b;
		System.out.println("Suma resultado: " + c);
		
		// Resta
		c = a - b ;
		System.out.println("Resta resultado: " + c);
		
		// Multiplicaci�n
		c = a * b ;
		System.out.println("Producto resultado: " + c);
		
		// Divisi�
		c = a / b ;
		System.out.println("Divisi�n resultado: " + c);
				
		// Multiplicaci�n
		c = a % b ;
		System.out.println("Residuo resultado: " + c);
		
		// Operaciones de asignaci�n con operaci�n
		c = 2;
		c+= a ;
		System.out.println("c+= : " + c);
		
		c-= a ;
		System.out.println("c-= : " + c);
		
		c*= a ;
		System.out.println("c*= : " + c);
		
		c/= a ;
		System.out.println("c/= : " + c);
		
		c%= a ;
		System.out.println("c%= : " + c);
		
		// Operador Incremento Prefijo ++		
		// Operador Decremento Decremento --
		
		int i = 3;
		i++;		// i = i + 1 ; 4
		// asignamos el valor de i y luego incrementamos
		System.out.println("Postfijo " + i);
		
		++i;		// i = i + 1 ; 4
		// incrementamos y luego asignamos el valor de i
		System.out.println("Prefijo " + i);
		// la diferencia radica en como se est�n ejecutando las operaciones
		
		System.out.println("Impresi�n Prefijo " + (++i)); // 6: primero imprime el valor incrementado de i 
		System.out.println("Impresi�n Prefijo " + (i++)); // 6: primero imprime el valor de i 
		System.out.println("i : " + i); // 6: primero imprime el valor de i
		
		// Equidad ==  !=
		a = 5;
		b = 4;
		System.out.println(a == b);	// false
		System.out.println(a != b);	// true
		
		// Operadores Relacionales  < >  <=  >=
		System.out.println(" a < b -> " + (a < b));	// false
		System.out.println(" a > b -> " + (a > b));	// true
		System.out.println(" a >= b -> " + (a >= b));	// true
		System.out.println(" a <= b -> " + (a <= b));	// f
		
		
	    //int x = 6, y;
	    //y = ++x;
	    //System.out.println(x);	// 6
		//System.out.println(y);    // 6
		
		//y = x++;
	    //System.out.println(x);		// 7
		//System.out.println(y);		// 6
		
		
	    //int i = 2;
	    i++;
	    System.out.println(i);		// 3
	    ++i;
	    System.out.println(i);		// 4
	    System.out.println(++i);	// 5
	    System.out.println(i++);	// 5
	    System.out.println(i);		// 6
	    
	    
	}

}
