package primitivos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Primitivos Integer */
		
//		Enteros byte, short, int, long
		// Los literales son de tipos enteros, van al lado derecho ya que al lado izquierdo va la variable
		byte byteVar = 15;
		System.out.println("Maximo de byte: " + Byte.MAX_VALUE + " Valor min:" + Byte.MIN_VALUE);
		
		long nuermoGrande = 12321321312312L;
		
		
// 		Algunas veces para asignar un valor gigante a un long, se debe agregar la L al final para indicarle que es de tipo long, ya que por
//		defecto cualquier numero pasado en codigo duro sera tomado como un int/Integer
		
		/* Base decimal, hexadecimal y octal */
		
		int numeroDecimal = 10;
		System.out.println("numeroDecimal : " + numeroDecimal);
		
		int numeroOctal = 012;
//		Esto se imprime en sistema decimal
		System.out.println("numeroOctal: " + numeroOctal);
		
		int numeroHexaDecimal = 0XA;
		System.out.println("numeroHexaDecimal: "+numeroHexaDecimal);
		
		int numeroBinario = 0B1010;
		System.out.println("numeroBinario: " + numeroBinario);
		
		/* Primitivos Float */
//		Decimales float, double 
		
//		Casteamos a Float Con F para indicar que es un float igual que en el double que es un numero que se tomoa como int por el tamaño
		float floatVar = 1000.102F;
		System.out.println("floatVar : " + floatVar);
		
		double doubleVar = 100D;
		System.out.println("doubleVar: " + doubleVar);
		
		
		/* Primitivos tipo Char */
		// El valor de char dependera de la plataforma en que se este trabajando ya que son parte del unicode
		char charVar = 'f';
		// Se pueden usar los codigos de unicode para definir un Character
		charVar = '\u0021';
		System.out.println("Varchar: "+charVar);
		// Podemos definirlo en decimal y java entendera eso automaticamente
		charVar = 37;
		System.out.println("Varchar: "+charVar);
		charVar = 33;
		System.out.println("Varchar: "+charVar);
		
		/* Primitivos tipo Boolean */
		
		boolean booleanVar = false;
		System.out.println("true tipo boolean: " + Boolean.TRUE);
		System.out.println("true tipo boolean: " + Boolean.FALSE);
		
		/* Conversiones tipos primitivos */
		
		int edad = Integer.parseInt("2");
		double valorPi = Double.parseDouble("3.1416");
		
		char c = "hola".charAt(0);
		
	}

}
