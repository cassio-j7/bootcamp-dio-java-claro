
public class TiposVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Em Java temos oito tipos primitivos: 
		/*
		 * int
		 * byte
		 * short
		 * long
		 * float
		 * double
		 * boolean
		 * char
		 *  
		 * */
		
		// Declaração de Variável
		
		// <Tipo> <nomeDaVariavel> = <atribuiaoDeValorOpcional>
		
		// Exemplos:
		
		int idade; // Tipo: 'int'; nome: 'idade', sem valor atribuido 
		int anaFabricacao = 2013; // Tipo: 'int', nome: 'anoFabricacao', com valor 2013
		double salarioMinimo = 2.500; // Tipo: 'double', nome: 'salarioMinimo', com valor 2.500
		

		// Observações
		
		int cep = 2107033; // se o cep começar com zero, talvez precise altera o tipo
		long cpf = 98765432109L; //se o cpf começar com o zero, precise alterar o tipo
		
		
		//Constantes
		
		// Em java, declaramos uma constante utilizando palara reservado 'final', o que não permite sua alteração durante a execução do programa
		
		final int NUMERO = 7; // Por convenção uma constante é nomeada em caixa alta
		
		// NUMERO = 20; ERROR
	}

}
