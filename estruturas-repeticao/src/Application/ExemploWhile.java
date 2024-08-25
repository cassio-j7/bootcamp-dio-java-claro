package Application;

import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * O laço While (enquanto) determina que enquanto uma condição for verdadeira, o bloco de código será executado. 
		 */
		
		
		
		double mesada = 50.0;
		
		
		while (mesada > 0) {
			Double valorDoce = valorAleatorio();
			
			if(valorDoce > mesada) {
				valorDoce = mesada;
			}
			
			System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho.");
			mesada -= valorDoce;
			
		} 
		System.out.println("Mesada: " + mesada);
		System.out.println("Joãozinho fastou toda a mesada.");

	}

	
	public static Double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2,8);
	}
}
