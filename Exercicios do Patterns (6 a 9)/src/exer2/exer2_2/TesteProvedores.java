package exer2.exer2_2;

public class TesteProvedores {
	
	public static void main(String[] args) {
		
		FactoryProvedor provFact = new FactoryProvedor();
		
		// Confidencial
		Provedor provedor = provFact.getProvedor("design patterns");
		provedor.exibir();
		
		// Publico
		provedor = provFact.getProvedor();
		provedor.exibir();
		
	}

}
