package exer1.exer1_2;

public class PizzaCalabresa implements Pizza {

	@Override
	public void printIngredientes() {
		System.out.println("Pizza Calabresa - Ingrediente: Queijo, Calabresa e Tomate");
	}

	@Override
	public String toString() {
		return "PizzaCalabresa []";
	}
}
