package Application;

import java.util.Random;

public class ExemploDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * O laço do Do/While assim como o laço while, consdiera qeu enquanto uma determinada condição fora válida o bloc oserá executado. 
		 * Entretando, diferente do While, que testa a condição antes de executar o código, o laço Do-While executa primeiro o código e depois testa condição. 
		 */
		
		// Do While
		
		System.out.println("Discando...");
		
		do {
			
			System.out.println("Telefone tocando!");
			
		} 
		while(tocando());
		
		System.out.println("Alô!");

	}
	
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1; // define valor aleatorio entre 1 e 3
		System.out.println("Atendeu? " + atendeu);
		//Negando o ato de continuar tocando
		return !atendeu;
	}

}
