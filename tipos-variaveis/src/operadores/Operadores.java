package operadores;

import java.time.LocalDate;
import java.util.Date;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Os operadores são simbolos qe tem significado próprio para a linguagem e estão associados a certas operações.
		
		// Os operadores são classificados em:
		
		
		// OPERADOR DE ATRIBUIÇÃO ' = '
		
		String nome = "Patricia";
		System.out.println(nome);
		
		int idade = 22;
		System.out.println(idade);

		
		double peso = 82.6;
		System.out.println(peso);
		
		char sexo = 'M';
		System.out.println(sexo);
		
		boolean doadorOrgao = true;
		System.out.println(doadorOrgao);
		
		Date dataNasci = new Date(); // Quando o tipo é uma classe, instacioamos com a palavra 'NEW'
		
		
		// OPERADORES ARITIMÉTICOS ' + , - , * , / , **, % '
		
		double soma = 19.6 + 7.2;
		System.out.println(soma);
		
		int subtração = 5 - 9;
		System.out.println(subtração);
		
		int multiplicacao = 8 * 7;
		System.out.println(multiplicacao);

		int divisao = 8/2;
		System.out.println(divisao);
		
		int modulo = 19%3;
		System.out.println(modulo);
		
		double reusltado = (10 * 7) + (20/4);
		System.out.println(reusltado);
		
		// OBS: O operador de adição +, quando usado com string serve como operador de concatenação
		String nomeCompleto = "LINGUAGEM" + " JAVA";
		System.out.println(nomeCompleto);
		
		
		// OPERADORES UNÁRIOS ' + , - , -- , ++ , ! '
		
		int num = 5;
		System.out.println(num);
		System.out.println(-num); // operador de negação aritimética ' - '
		
		int cont = 20;
		
		cont++; // operador de incremento ' ++ '
		
		System.out.println(cont);
		
		cont--; // operador de decremento ' -- '
		
		System.out.println(cont);
		
		boolean variavel = true;
		System.out.println(!variavel); // operador logico de negação ' ! ' 
		
		
		
		// OPERDAOR TERNÁRIO
		
		// O operador ternário pe representado pelos simpbols ?: utilizados da seguite forma: 
		
		//  < EXPRESSÃO CONDICIONAL > ? < CASO A CONDIÇÃO SEJA TRUE > : < CASO A CONDIÇÃO SEJA FALSA > 
		
		int a, b, c, d;
		
		// UTILIZANDO IF ELSE
		a = 5;
		b = 6;
		c = 2;
		d = 2;
		
		if( a == b) {
			boolean resultado = true;
		} else {
			boolean resultado = false;
		}
		
		// UTILIZANDO OPERADOR TERNÁRIO
		
		boolean resultado = c==d ? true : false;
		System.out.println(resultado);
		
		int resultadoNum = c == d ? 1 : 0;
		System.out.println(resultadoNum);
		
		
		// OPERADORES RELACIONAIS
		
		// Os operadores relacionais avliam a relação entre duas variáveis ou expressões e retornan um booleano como resultado (true ou false)
		
		// Os operadores são: 
		
		int x = 5;
		int y = 6;
		int z = 5;
		
		boolean igualdade = x == y;
		System.out.println(igualdade);
		
		boolean diferente = x != y;
		System.out.println(diferente);
		
		boolean maiorQue = x > y;
		System.out.println(maiorQue);
		
		boolean menorQue = x < y;
		System.out.println(menorQue);
		
		boolean maiorOuIgual = x >= z;
		System.out.println(maiorOuIgual);
		
		boolean menorOuIgul = x <= y;
		System.out.println(menorOuIgul);
		
		
		// Os operadores relacionais também podem nos auxiliar em fluxos.
		
		if(x == y) {
			System.out.println("x é igual a y");
		} else {
			System.out.println("x é diferente de y");
		}
		
		
		// Para comparar conteúdos ou objetos usamos o metodo .equals
		
		String nomeUm = "Gleison";
		String nomeDois = new String("GLEYSON");
		
		System.out.println(nomeUm.equals(nomeDois));
		
		
		
		// OPERADORES LÓGICOS
		
		// Nos permite criar expressões lógicas maiores a partir de outras.
		
		// Os operadores são: 
		
		// && operador lógico conjuntivo E
		// || operador lógico disjuntivo OU
		// ! operador lógico de negação NÃO
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		if( condicao1 && condicao2) {
			System.out.println("As duas condições são verdadeiras");
		}
		
		if(condicao1 || condicao2) {
			System.out.println("Uma das condições são verdadeiras");
		}
		
		
		
		
		
		
		

	}

}
