import java.util.Locale;
import java.util.Scanner;

public class MinhClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá Mundo CMD");
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Escreva seu nome: ");
		String nome = scanner.next();
		scanner.next();
		
		System.out.println("Esreva sua altura: ");
		double altura = scanner.nextDouble();
		
		System.out.println("Escreva sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("------------");
		System.out.println(nome + " " + altura + " " + idade);

	}

}
