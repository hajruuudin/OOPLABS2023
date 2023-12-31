package Task6;

import java.util.List;

public interface CoffeeBuilder {
    void buildType(String type);
    void buildSize(String size);
    void buildToppings(List<String> toppings);
    Coffee returnCoffee();
}
