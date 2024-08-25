package Application;

public class ExemploFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Estruturas de repetição também conhecidas como laços de iteração ou simplesmente loops, são comandos que permitem iteração de código. 
		 * Ou seja, que comandos presentes no bloco sejam repetidos diversas vezes. 
		 */
		
		// FOR
		
		/*
		 * O comando for permite que uma variável contadora seja testada e incrementada a cada iteração. 
		 * 
		 * A estrutura do comando é aseguinte:
		 * 
		 *   for ( bloco de inicialização; expressão booleana; bloco de incrementação){
		 *   		// expressão que será executada
		 *   }
		 * 
		 */
		
		// João precisa conta 20 carneirinhos paraa dormir
		
		for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
				
			if(carneirinhos > 9 ) {
				System.out.println( carneirinhos + " carneirinhos");
			} else {
				System.out.println(carneirinhos + " carneirinho");
			}
		}
		System.out.println("Joãozinho dormiu!");
		
		
		
		// FOR EM ARRAYS
		
		String  alunos[] = {"Felipe", "Claudio", "Patricia", "Amanda"};
		
			for (int x=0; x < alunos.length; x++) {
				System.out.println("O aluno pa posição x = " + x + " é " + alunos[x]);
			}
		

		
		// FOR EACH
			
		// Uma versão do For um pouca mais otimizada
			
			for(String aluno : alunos) {
				System.out.println("Nome do aluno é " + aluno);
			}
			
			
		// BREACK & CONTINUE
			
			/*
			 * Break significa quebrar, interromper.Continue, significa continua o laço. 
			 * O comando 'break interrompe o laço, já o comando 'continue' interrompe somente a iteração atual
			 */
			
			// BREAK
			for (int numero = 1; numero <= 5; numero++) {
				if(numero == 3)
					break; // para no nummero 3
				
				System.out.println(numero);
			}
			
			// CONTINUE
			for(int numero = 1; numero <= 5; numero++) {
				if(numero == 3)
					continue; // pula o numero 3
				
				System.out.println(numero);
			}
			
	}

}
