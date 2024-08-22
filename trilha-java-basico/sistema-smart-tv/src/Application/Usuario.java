package Application;

public class Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV ligada " + smartTv.ligada);
		System.out.println("Canal atual " + smartTv.canal);
		System.out.println("Volume inicial " + smartTv.volume );
		
		System.out.println("-------------------------");
		
		smartTv.desligar();
		System.out.println("Novo status - "  + smartTv.ligada);
 
		System.out.println("-------------------------");
		
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println("Volume atual: " + smartTv.volume);
		
		System.out.println("-------------------------");
		
		smartTv.trocarCanal(8);
		System.out.println("Novo canal: " + smartTv.canal);
	}

}
