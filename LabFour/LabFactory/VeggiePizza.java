public class VeggiePizza extends Pizza{
	
	
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory){
    	
        this.ingredientFactory = ingredientFactory;
    }
    
    public void prepare(){
    	
        System.out.println("Preparing " + getName()+ "\n");
        
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.veggies = ingredientFactory.createVeggies();
    }
}