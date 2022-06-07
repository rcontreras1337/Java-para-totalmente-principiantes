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
	         
	         /* operadores condicionales  */
		        
		        System.out.println();
		        System.out.println("operadores condicionales");
		        System.out.println();
		        
		        a = 15;
		        int valorMinimo = 0, valorMaximo=10;
		        // dentro de rango 0-10
		        boolean resultadoBo = a >= valorMinimo && a <= valorMaximo;
		        System.out.println("resultado = " + resultadoBo);
		        
		        boolean vacaciones = false;
		        boolean diaDescanso = true;
		        // si cualquiera de las dos opciones es verdadero o lo que nosotros le pidamos, retornara true
		        if(vacaciones || diaDescanso)
		            System.out.println("Padre puede asistir al juego del hijo");
		        else
		            System.out.println("Padre ocupado");
		        
		        /* operador Ternario  */
		        // sirve para simplificar el if y el else, colocandolo en una sola linea
		        System.out.println();
		        System.out.println("operador Ternario");
		        System.out.println();
		        // la estructura e sla comentada, recive una expesion de operacion relacional o de igualdad, luego la primera casilla sera
		        // si lo cumple y luego si no lo cumple
		        
		        // ademas puede regresar dos datos diferentes tal cual lo haria un if else
		        					// expresion // true : false
		        var resultadoTernario = (3 > 2) ? "verdadero" : false;
		        // recordar que este ejemplo solo funciona porque var detecta el tipo de dato que se recibira
		        System.out.println("resultado = " + resultadoTernario);
		        
		        var numero = 8;
		        var par = (numero % 2 == 0) ? "numero par" : "numero impar";
		        System.out.println("par = " + par);
		        
		        
		        /* Precedencia de operadores en java  */
		        
		        System.out.println();
		        System.out.println("Precedencia de operadores en java");
		        System.out.println();
		        
		        var x = 5;
		        var y = 10;
		        var z = ++x + y--;//x=6, y=10, z=16
		        System.out.println("x = " + x);
		        System.out.println("y = " + y);
		        System.out.println("z = " + z);

		        System.out.println("\nEjemplo 2 precedencia operadores");
				var resultadoPrecencia = 4 + 5 * 6 / 3;// 4+((5*6)/3) => 4+(30/3) => 4+10 => 14
				System.out.println("resultado = " + resultadoPrecencia);
		        
		        resultadoPrecencia = (4 + 5) * 6 / 3;
		        System.out.println("resultado = " + resultadoPrecencia);

	}

}
