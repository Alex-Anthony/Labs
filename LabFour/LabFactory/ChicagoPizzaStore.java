public class ChicagoPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		
		Pizza pizza = null;
		
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
  
		} else if (item.equals("veggie")|| item.equals("Veggie")|| item.equals("VeggiePizza")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
			
 
		} else if (item.equals("clam")|| item.equals("Clam")|| item.equals("ClamPizza")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
			
 
		} else if (item.equals("pepperoni")|| item.equals("Pepperoni")|| item.equals("PepperoniPizza")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
 
		} 
		
		return pizza;
	}
}
