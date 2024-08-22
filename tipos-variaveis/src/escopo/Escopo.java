package escopo;

public class Escopo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Escopo pode ser entendido como o ambiente onde uma variável pode ser acessada. 
		
		int a = 2; // variável de escopo global
		int b = 5; // variável de scopo global
		
		int soma = a + b;
		System.out.println(soma);
		
		if(a > 0) {
			String dia = "segunda-feira"; // variavel de escopo local
			System.out.println(dia);
		}
		
		// dia; ERROR

	}

}
