package variables;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String saludar = "Saludos";
		System.out.println();
		System.out.println();
		System.out.println();

		var hola = "aja";
		// Var solo se puede utilizar si la variable esta definida, de lo contrario no sabra que tipo de valor es
		var numero = 1;
		
		System.out.println(saludar + " " + hola);
		// suma
		System.out.println(numero + numero);
//		concatena
		System.out.println("hola" + numero + numero);
//		suma porque lee de izquierda a derecha, si al comienzo hay suma, esta se suma
		System.out.println(numero + numero + "hola");
//		Romper este paradigma usando parentesis
		System.out.println("hola" + (numero + numero));
		
		
		
		String nombre = "Karla";
		String apellido = "Esparza";
		System.out.println(nombre + " " + apellido);
		System.out.println("Nueva linea: \n" + nombre);
		System.out.println("Tabulador: \t" + nombre);
		System.out.println("Retroceso: \b" + nombre);
//		System.lineSeparator() no tiene problemas con saber que se debe usar si n o r
		System.out.println("Retorno Carro: \r" + nombre);
		System.out.println("Comilla simple: \'" + nombre + "\'");
//		La \ diagonal inversa es un caracter de escape, sirve para reconocer todos esos caracteres especiales
		
		
		
		
	}

}
