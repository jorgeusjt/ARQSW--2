package exer2.exer2_2;


public class FactoryProvedor {
	
	public Provedor getProvedor(String senha) {
		if (senha.equals("design patterns")) {
			return new ProvedorConfidencial();
		}
		// Se a senha for incorreta, retorna o p�blico
		return new ProvedorPublico();
	}
	
	public Provedor getProvedor() {
		return new ProvedorPublico();
	}

}
