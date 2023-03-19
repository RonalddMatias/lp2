import java.util.Scanner;

public class resultadoProvas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num = 0;
		int soma = 0;
		int maiorNota = 0;
		int menorNota = 1000;
		int cont = 0;
		int acimaMedia = 0;
		int abaixoMedia = 0;
		int media = 0;
		
		while(true) {
			String[] dados = sc.nextLine().split(" ");
			
			//sentinela
			if(dados[0].equals("-")) {
				break;
			}
			
			num = Integer.parseInt(dados[1]); 
			soma += num;
			cont++;
			
			if(num > maiorNota) {
				maiorNota = num;
			}
			if (num < menorNota) {
				menorNota = num;
			}
			
			media = soma / cont;
			
			if(num >= 700){
				acimaMedia++;
			} else {
				abaixoMedia++;
			}
		
		}
		
		System.out.println("maior: " + maiorNota);
		System.out.println("menor: " + menorNota);
		System.out.println("media: " + media);
		System.out.println("acima: " + acimaMedia);
		System.out.println("abaixo: " + abaixoMedia);
		
	}
}
