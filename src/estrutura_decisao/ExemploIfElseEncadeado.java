package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {
		// variaveis
		float media;

		Scanner leia = new Scanner(System.in);

		// entrada
		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();

		// processamento
		if (media >= 6) {
			System.out.println("Parabéns, você foi aprovade!");

		}else if(media >= 5){
			System.out.println("Participante de Examae.");
			
		}else {
			System.out.println("Infelizmente você foi reprovade.");
		}
		

		leia.close();

	}

}
