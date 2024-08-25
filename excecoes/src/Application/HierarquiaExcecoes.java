package Application;

import java.text.NumberFormat;
import java.text.ParseException;

public class HierarquiaExcecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * A linguagem Java dispo~e de uma variedade de classes que representam exceções, e estas classes são organizads em uma hierarquia denominada
		 *  CHECKED AND UNCHECKED EXCEPTIONS - ou exceções checadas e não checadas
		 */
		
		/*
		 *                  Throwable
		 *                  /       \ 
		 *               Error     Exception ----------
		 *                           /                 \
		 *                          /                   \  
		 *               RuntimeException                \
		 *                        /                       IOException
		 *                       /                        SQLException
		 *               NullPointerException             MalFormURLException
		 *               NumberFormatException                 ...
		 *               ClassCastException
		 *               IndexOutOfBoundExceptio
		 *               		...
		 */
		
		// O que determina uma exceção ser checada ou não-checada é o risco dela ser disparada.
		
		// Exemplos
		
		Number valor = Double.valueOf("a1.75");
		
		try {
			valor = NumberFormat.getInstance().parse("a1.75");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(valor);

	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
