package edu.cassio.primeirasemana;

public class BoletimEstudantil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mediaFinal = 6;
		
		// Sem identação 
		
		if(mediaFinal < 6)
		System.out.println("REPROVADO");
		else  if(mediaFinal == 6)
		System.out.println("PROVA MINERVA");
		else 
		System.out.println("APROVADO");
		
		// Com identação
		
		int mediaParcial = 6;
			if(mediaParcial < 7)
				System.out.println("REPROVADO");
			else  if(mediaParcial == 5)
				System.out.println("PROVA SNAPE");
			else 
				System.out.println("APROVADO");

	}

}
