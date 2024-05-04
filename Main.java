/*
comandos de compilacion en CMD
javac -d ./classes ./source/*.java
java -cp ./classes Main
*/
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		String separador = "**********************************************";
		System.out.println(separador);
		System.out.println("Sea Bienvenido/a al Conversor de Monedas c:");
		System.out.println("");
		System.out.println("1) Dolar => Peso Argentino");
		System.out.println("2) Peso Argentino => Dolar");
		System.out.println("3) Dolar => Real Brasileno");
		System.out.println("4) Real Brasileno => Dolar");
		System.out.println("5) Dolar => Peso Colombiano");
		System.out.println("6) Peso Colombiano => Dolar");
		System.out.println("7) Salir");
		System.out.println("Elija una opcion valida:");
		System.out.println(separador);

		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();
		
		System.out.println("Ingresa el valor que deseas convertir:");
		int efectivo = teclado.nextInt();
	}
}