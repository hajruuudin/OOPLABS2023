package Task6;

import java.util.List;

public class CappuccinoBuilder implements CoffeeBuilder{
    private Coffee coffee = new Coffee("Cappucino", "Small", null);

    @Override
    public void buildType(String type) {
        coffee = new Coffee(type, coffee.size, coffee.toppings);
    }

    @Override
    public void buildSize(String size) {
        coffee = new Coffee(coffee.type, size, coffee.toppings);
    }

    @Override
    public void buildToppings(List<String> toppings) {
        coffee = new Coffee(coffee.type, coffee.size, toppings);
    }

    @Override
    public Coffee returnCoffee() {
        return coffee;
    }
}
