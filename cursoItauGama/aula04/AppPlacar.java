package jogodefutebol;

public class AppPlacar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Placar b1 = new Placar();
		Placar b2 = new Placar("Goias", "Plameiras");
		Placar b3 = new Placar("flamengo", "Botafogo", 5, 1);
		
		
		System.out.println(b1.getPlacar());
		System.out.println(b2.getPlacar());
		System.out.println(b3.getPlacar());

	}
	
	

}
