package Task6;

import java.util.List;

public class CoffeeDirector {
    public void constructCoffee(CoffeeBuilder builder) {
        builder.buildType("Small Esspresso in a LARGE cup");
        builder.buildSize("Average");
        builder.buildToppings(List.of("Extra Sugar", "Milk"));
    }
}
