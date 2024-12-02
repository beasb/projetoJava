package intro;

import java.util.Scanner;    // Importando a Scanner para dentro da Classe

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variaveis
		String nome;
		float temperatura;
		float fahrenheit;
		
		Scanner leia = new Scanner(System.in);
		
		// Pedir p inserir o nome, temperatura 
		System.out.println("Insira o seu nome: ");
		nome = leia.next();
		
		System.out.println("Insira a temperatura em Celsiues: ");
		temperatura = leia.nextFloat();
		
		// Processamento
		fahrenheit = temperatura * 1.8f + 32;
		
		// Saída dos Dados
		System.out.println("Bom dia, " + nome);     // concatenação
		System.out.printf("A temperatura em Fahrenheit é %.1f.", fahrenheit);  
		System.out.printf("\nA temperatura em Fahrenheit é %.2f.", fahrenheit);    // mudando o f
		System.out.println("\nA temperatura em Fahrenheit é: " + fahrenheit);   // com concatenação
		
	}

}
