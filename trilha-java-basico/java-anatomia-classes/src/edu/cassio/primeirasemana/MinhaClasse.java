package edu.cassio.primeirasemana;

public class MinhaClasse {

	public static void main(String[] args) {
		System.out.println("Ola mundo!");
		
		final String BR = "Brasil"; 
		// Utilizando a palavra final, dizemos que o valor de BR é imutável. Isso não permite alterar o valor da variável.
		
		//BR = "Brasil"; ERROR
		
		
		// DECLARAÇÃO DE VARIÁVEIS
		
			// Declarações inválidas
		/*
			int numero&um = 1;
			int 1numero = 1;
			int %numero = 1;
			int numero um = 1;
			int long = 1;
		*/
			
			//Declarações válidas
			
			int numero$um = 1;
			int numero1 = 1;
			int _numero = 1;
			int numeroUm = 1;
			int longo = 1;
			
			
		
			String meuNome = "Glayson";
			
			int anoFabricacao = 2022;
			
			boolean verdadeira = true;
			
			anoFabricacao = 2018;	
			
			String nome = "Kadu";
			String sobreNome = "Bird";
			
			String nomeTodo = nomeCompleto(nome, sobreNome);
			
			System.out.println( nomeTodo);
			
			
	}
	
	public static String nomeCompleto(String nome, String sobreNome) {
		return nome.concat(" ").concat(sobreNome);
	}
	
	

}
