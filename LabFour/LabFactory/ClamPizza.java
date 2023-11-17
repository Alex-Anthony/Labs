public class ClamPizza extends Pizza {
	
	PizzaIngredientFactory ingredientFactory;
 
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		
		System.out.println("Preparing " + getName() + "\n");
		
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
	}
}
