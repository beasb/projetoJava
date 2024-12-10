package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		/*   num1 = leia.nexInt(); 
		 * 	 num2 = leia.
		 * 	 somar(num1,num2);	
		 * */
		
		int resultado = somar(2,5);
		System.out.println("O primeiro resultado é " + resultado);
		
		System.out.println("O segundo resultado é " + somar(8,3));
		
		falar("Pode ser, bom dia!");
		falar("O gato amarelo");
		
		falar("O primeiro resultado é " + resultado);
		
		ExemploMetodoExterno.mensagem();
	}
	
	// definição do método somar   - método com retorno e com parametro
	public static int somar(int x, int y) {
		return x + y;
	}
	
	// definição do método falar   - método sem retorno e com parametro
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}
	
}
