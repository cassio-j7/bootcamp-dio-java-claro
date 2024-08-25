package Application;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Excecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ao executar um código java, diferentes erros podem acontecer devido a erros de codigficação ou dados incorretos.
		
		// Quando um erro acontece, o Java para e gera uma mensagem de erro. O termo técnico para isso é: Java lançara um exceção(Throw exception).
		
		// Para tratar execeções usamos try - cacth - finally
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		try {
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		
		
		System.out.println("Digite sua sobrenome: ");
		String sobrenome = scan.nextLine();
		
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		
		// IMPRIMINDO DADOS NA TELA
		System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
		System.out.println("Tenho " + idade + " anos ");
		System.out.println("Minha altura é " + altura + "m");
		} catch(InputMismatchException e ) {
			System.err.println("Os campos de idade e altura precisam ser numéricos!");
		}
		
		
	// Java possui uma lista de classes que representam execeções especificas
		
		/*
		 *  java.lang.NullPointerExeception - quando tentamos obter alguma informação de uma variavel nula
		 *  java.lang.ArithmeticException - quanto tentamos dividir um numero por zero
		 *  java.lang.SQLException - quando existe um erro relacionado a interação com banco de dados
		 *  java.io.FileNotFoundException - quando tentamos ler ou escrever um arquivo que não existe
		 *  
		 */

	}

}
