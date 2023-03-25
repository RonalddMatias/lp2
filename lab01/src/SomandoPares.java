import java.util.Scanner;

public class SomandoPares {
	/**
	 * Laboratório de Programação 2 - Lab 1
	 * 
	 * Ronaldd Feliph Matias Costa - 122110574
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int somador = 0;
		String[] numeros = sc.nextLine().split(" ");
		
		for(int i = 0; i < numeros.length; i++) {
			int valor = Integer.parseInt(numeros[i]);
			if (valor % 2 == 0) {
				somador += valor;
			}
		}
		
		System.out.println(somador);
		
		sc.close();

	}

}
