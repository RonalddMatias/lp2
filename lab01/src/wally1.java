import java.util.Scanner;

public class wally1 {
	/**
	 * Laboratório de Programação 2 - Lab 1
	 * 
	 * Ronaldd Feliph Matias Costa - 122110574
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomes;
		String parecidoComWally = "";
		
		do {
			nomes = sc.nextLine();
			parecidoComWally = "";
			for(String nome : nomes.split(" ")) {
				if(nome.length() == 5) {
					parecidoComWally = nome;
				} else if(parecidoComWally.equals("")) {
					parecidoComWally = "?"; // caso não acha ninguem com com 5 letras, ficará um interrogacao
				}
			}
			
			if(parecidoComWally != "" && !parecidoComWally.equals("wally")) {
				System.out.println(parecidoComWally);
			}
			
			
		} while(!(nomes.equals("wally")));
		
		sc.close();
	}

}
