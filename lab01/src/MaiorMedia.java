import java.util.Scanner;

public class MaiorMedia {
	
	/**
	 * Laboratório de Programação 2 - Lab 1
	 * 
	 * Ronaldd Feliph Matias Costa - 122110574
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;

		String[] numeros = sc.nextLine().split(" ");
		// System.out.println(numeros[0]);

		// iterando sobre os elementos do array e passando eles para inteiro e
		// adicionando em uma variável soma
		for (String num : numeros) {
			soma += Integer.parseInt(num);
		}

		double media = (double) soma / numeros.length;

		String output = "";
		// imprimindo com um for earch
		for (String num : numeros) {
			int valor = Integer.parseInt(num);
			if (valor > media) {
				String newNumber = Integer.toString(valor);
				if (output.equals("")) {
					output += newNumber;
				} else {
					output += " " + newNumber;
				}

			} else {
				continue;
			}
		}
		System.out.println(output);

		sc.close();
	}

}
