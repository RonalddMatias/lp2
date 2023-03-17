import java.util.Locale;
import java.util.Scanner;

public class calculadora {

	/**
	 * Laboratório de Programação 2 - Lab 1
	 * 
	 * Ronaldd Feliph Matias Costa - 122110574
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String operacao = sc.nextLine();
		if (Valida(operacao)) {

			double num1 = sc.nextDouble();

			double num2 = sc.nextDouble();

			switch (operacao) {
			case "+":
				System.out.println("RESULTADO: " + (num1 + num2));
				break;
			case "-":
				System.out.println("RESULTADO: " + (num1 - num2));
				break;
			case "*":
				System.out.println("RESULTADO: " + (num1 * num2));
				break;
			case "/":
				if (num2 != 0) {
					System.out.println("RESULTADO: " + (num1 / num2));
					break;
				} else {
					System.out.println("ERRO");
					break;
				}

			default:
				System.out.println("ENTRADA INVALIDA");
			}
		} else {
			System.out.println("ENTRADA INVALIDA");
		}

		sc.close();
	}

	public static boolean Valida(String operador) {
		boolean verificar = false;

		if (operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")) {
			verificar = true;
		}

		return verificar;
	}

}
