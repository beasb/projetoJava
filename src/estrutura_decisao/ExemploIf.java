package estrutura_decisao;

import java.util.Scanner;


public class ExemploIf {

	public static void main(String[] args) {
		
		// variaveis 
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		// entrada
		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();
		
		// processamento
		if(media >= 6) {
			// saída
			System.out.println("Parabéns, você foi aprovade!");
		}
		
		leia.close();
		
		

	}

}
