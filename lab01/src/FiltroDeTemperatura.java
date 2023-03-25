import java.util.Scanner;

public class FiltroDeTemperatura {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int contNegativo = 0;
		
		while(num != 0) {
			num = sc.nextInt();
			
			if(num < 0) {
				contNegativo++;
			}
		}
		
		System.out.println(contNegativo);
		sc.close();
	}

}
