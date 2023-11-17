public class MyPizzaApp{
	
	public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: MyPizzaApp <Franchise> <PizzaType>");
            System.exit(1);
        }

        PizzaStore store = null;

        if (args[0].equalsIgnoreCase("NYPizzaStore")) {
            store = new NYPizzaStore();
        } else if (args[0].equalsIgnoreCase("ChicagoPizzaStore")) {
            store = new ChicagoPizzaStore();
        }
        if (store != null) {
            store.orderPizza(args[1]);
        } else {
            System.out.println("Invalid franchise specified.");
        }
    }
}