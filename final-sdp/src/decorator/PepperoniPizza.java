package decorator;

// New PepperoniPizza class
public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        description = "Pepperoni Pizza";
    }

    @Override
    public double cost() {
        return 10.99;
    }
}