/*
comandos de compilacion en CMD
javac -cp C:/Users/fabia/Downloads/gson-2.10.1.jar -d ./../classes *.java
java -cp ./../classes;C:/Users/fabia/Downloads/gson-2.10.1.jar Main
*/
import java.lang.InterruptedException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) throws IOException, InterruptedException {
		String separador = "**********************************************";
		System.out.println(separador);
		System.out.println("Sea Bienvenido/a al Conversor de Monedas c:");
		System.out.println("");
		System.out.println("1) Dolar => Peso Argentino");
		System.out.println("2) Peso Argentino => Dolar");
		System.out.println("3) Dolar => Peso Mexicano");
		System.out.println("4) Peso Mexicano => Dolar");
		System.out.println("5) Dolar => Euro");
		System.out.println("6) Euro => Dolar");
		System.out.println("7) Salir");
		System.out.println("Elija una opcion valida:");
		System.out.println(separador);

		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();

		Conversion conversion = new Conversion();
		switch(opcion) {
		case 1:
			conversion.setParametrosConversion("USD", "ARS");
			break;
		case 2:
			conversion.setParametrosConversion("ARS", "USD");
			break;
		case 3:
			conversion.setParametrosConversion("USD", "MXN");
			break;
		case 4:
			conversion.setParametrosConversion("MXN", "USD");
			break;
		case 5:
			conversion.setParametrosConversion("USD", "EUR");
			break;
		case 6:
			conversion.setParametrosConversion("EUR", "USD");
			break;
		case 7:
			System.out.println("Gracias por usar el conversor de monedas!");
			System.exit(0);
			break;
		default:
			System.out.println("Error, opcion invalida");
		}

		System.out.println("Ingresa el valor que deseas convertir:");
		int efectivo = teclado.nextInt();
		conversion.setValor(efectivo);
		System.out.println(conversion.realizarConversion());
	}
}