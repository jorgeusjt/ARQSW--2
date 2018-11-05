package exer1.exer1_2;

public class PizzaPresunto implements Pizza {

	@Override
	public void printIngredientes() {
		System.out.println("Pizza Presunto - Ingrediente: Queijo, Presunto e Tomate");
	}

	@Override
	public String toString() {
		return "Pizza_Presunto []";
	}
}
