package Application;

public class EstruturasCondicionais {
	
	public static void main(String[] args) {
		
		// As estruturas condicionais controlam o o fluxo de tarefas durante a execução de um programa.
		
		// São elas: 
		
		/*
		 * Estruturas Condicionais: IF ELSE SWITCH-CASE
		 * Estruturas de Repetição: FOR, WHILE, DO-WHILE
		 * Estruturas de Exceções: TRY-CATCH-FINALLY, THROW
		 */
		
		
		// CONDICIONAL SIMPLES - UM FLUXO
		double saldo = 25.0;
		double valorSolicitado = 17.0;
		
		if(valorSolicitado < saldo) { // PRIMEIRO FLUXO
			saldo-=valorSolicitado;
			
			System.out.println(saldo);
		}
		
		
		// CONDICIONAL COMPOSTA - DOIS FLUXOS
		int nota = 6;
		
		if(nota >= 7) { 
			System.out.println("Aluno aprovado"); // PRIMEIRO FLUXO
		} else {
			System.out.println("Aluno reprovado"); // SEGUNDO FLUXO
		}
		
		
		// CONDICIONAL ENCADEADA - TRÊS OU MAIS FLUXOS
		
		int outraNota = 6;
		
		if(outraNota >= 7) {
			System.out.println("Aluno aprovado");   // PRIMEIRO FLUXO
		} else if(outraNota >= 5 && outraNota < 7 ) {
			System.out.println("Aluno em recuperação"); // SEGUNDO FLUXO
		} else {
			System.out.println("Aluno reprovado"); // TERCEIRO FLUXO
		}
		
		
		// CONDIÇÃO TERNÁRIA  - CONDIÇÃO ATRIBUIDA A UMA VARIÁVEL
		
		int novaNota = 6;
		
		String resultado = novaNota >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
		
		int mesmaNota = 7;
		String outroResultado = mesmaNota >= 7 ? "Aprovado" : mesmaNota >= 5 && mesmaNota < 7 ? "Recuperação" : "Reprovado";
		System.out.println(outroResultado);
		
		
		// SWITCH CASE - QUANDO TEMOS MUITAS CONDIÇÕES E UMA VARIÁVEL DE CONTROLE
		
		char sigla = 'A'; // VARIÁVEL DE CONTROLE
		
			switch (sigla) {
			
				case 'P': {
					System.out.println("Tamanho pequeno");
					break;
				}
			
				case 'M': {
					System.out.println("Tamanho médio");
					break;
				}
				
				case 'G': {
					System.out.println("Tamanho grande");
					break;
				}
				
				default:
					System.out.println("Tamanho indefinido");
			}
		
		
		
		
		
	}

}
