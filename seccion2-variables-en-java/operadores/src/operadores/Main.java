package operadores;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* operadores aritmeticos */
		System.out.println("operadores aritmeticos");
		System.out.println();
		 int a = 3, b = 2;

	        var resultado = a + b;
	        System.out.println("resultado suma = " + resultado);

	        System.out.println("resultado suma=" + a  + b );
	        
	        System.out.println("resultado suma=" + (a  + b) );
	        
	        resultado = a - b;
	        System.out.println("resultado resta = " + resultado);
	        
	        System.out.println("resultado resta = " + (a - b));
	        
	        resultado = a * b;
	        System.out.println("resultado multiplicacion = " + resultado);
	        
	        double resultado2 = 3D / b;
	        System.out.println("resultado division = " + resultado2);
	        
	        resultado = a % b;
	        System.out.println("resultado modulo= " + resultado);
	        
	        resultado = a % 2;
	        System.out.println("resultado = " + resultado);
	        
	        resultado = 123 % 2;
	        System.out.println("resultado = " + resultado);
	        
	        if(resultado == 0)
	            System.out.println("es numero par");
	        else
	            System.out.println("es numero impar");
	        
	        /* operadores asignacion */
	        
	        System.out.println();
	        System.out.println("operadores asignacion");
	        System.out.println();
	        
	        int cc = a + 5 - b;
	        System.out.println("c = " + cc);

	        a += 1;//a=a+1
	        System.out.println("a = " + a);
	        
	        a += 3;//a=a+3
	        System.out.println("a = " + a);
	        
	        b -= 1;//b=b-1
	        System.out.println("b = " + b);
	        
	        // *=, /=, %= 
	        
	        /* operadores Unarios */
	        
	        System.out.println();
	        System.out.println("operadores Unarios");
	        System.out.println();
	         a = 3;
	         b = -a;
	        System.out.println("b = " + b);
	        
	        boolean c = true;
	        boolean d = !c;
	        System.out.println("d = " + d);
	        
	        //incremento
	        //preincremento, asignara la suma y la variable a f al instante
	        int e = 3;
	        int f = ++e;
	        System.out.println("e = " + e);
	        System.out.println("f = " + f);
	        
	        //postincremento, primero se asigna el valor de la g a h, pero solo se incrementara h a la siguiente vez que se use la variable
	        int g = 5;
	        int h = g++;
	        System.out.println("g = " + g);
	        System.out.println("h = " + h);
	        
	        //decremento
	        //predecremento
	        int i=2;
	        int j = --i;
	        System.out.println("i = " + i);
	        System.out.println("j = " + j);
	        
	        //postdecremento
	        int k=4;
	        int l= k--;
	        System.out.println("k = " + k);
	        System.out.println("l = " + l);
	        
	        /* operadores igualdad y relaciones */
	        System.out.println();
	        System.out.println("operadores igualdad y relaciones ");
	        System.out.println();
	        
	        a=3; 
	        b=4;
	        
	        c = (a == b); // solo para primitivos
	         System.out.println("c = " + c);
	         
	         c = (a != b);
	         System.out.println("c = " + c);
	         
	         String cadena = "hola";
	         String cadena2 = "hola";
	         System.out.println( cadena.equals(cadena2) );
	         
	         // operadores relacionales
	         
	         boolean dd = a <= b;
	         System.out.println("d = " + dd);
	         
	         if( b % 2 == 0){
	             System.out.println("numero par");
	         }
	         else{
	             System.out.println("numero impar");
	         }
	         
	         int edad = 31;
	         int adulto = 18;
	         // si el bloque de dentro del if o el else es solo una linea puede ir sin llaves, si tiene mas de dos linesa
	         // debe llevar llaves
	         if ( edad >= adulto)
	             System.out.println("es un adulto");
	         else
	             System.out.println("es menor de edad");

	}

}
