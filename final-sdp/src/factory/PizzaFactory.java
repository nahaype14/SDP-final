package factory;

import decorator.MargheritaPizza;
import decorator.PepperoniPizza;
import decorator.Pizza;

// Factory pattern
public class PizzaFactory {
    public Pizza createPizza(String type) {
        switch (type.toLowerCase()) {
            case "margherita":
                return new MargheritaPizza();
            case "pepperoni":
                return new PepperoniPizza();
            default:
                throw new IllegalArgumentException("Invalid pizza type: " + type);
        }
    }
}
