package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {

		// Cria a Collection ArrayList, do tipo Double, chamada notas
		ArrayList<Double> notas = new ArrayList<Double>();

		Scanner leia = new Scanner(System.in);            // ex de inserir
		
		// Cria um Objeto da Classe Wrapper Double
		Double y = Double.valueOf(9);
		
		System.out.println("Digite um valor");
		Double idade = leia.nextDouble();                // ex de inserir
		/**
		 * Adiciona algumas Notas. Observe que a primeira nota é o Objeto Wrapper
		 * Double.
		 */
		
		notas.add(idade);                               // ex de inserir
		
		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);

		/**
		 * Mostra na tela todas as notas adicionadas. Observe que a nota duplicada foi
		 * adicionada duas vezes.
		 */
		System.out.println("\nNotas cadastradas: " + notas);
		
		/**
		 * Mostra na tela todas as notas através do laço For...Each. 
		 */
		System.out.println("\nNotas cadastradas - Laço For...Each");

		for(Double nota : notas) {                      // com o for each só da pra inserir 1 vez, ele percorre em coluna
			System.out.print(nota);
		}

	}

}
