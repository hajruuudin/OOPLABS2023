package Task6;

public class Main {
    public static void main(String[] args) {
        CoffeeDirector director = new CoffeeDirector();

        EspressoBuilder espressoBuilder = new EspressoBuilder();
        director.constructCoffee(espressoBuilder);
        Coffee espresso = espressoBuilder.returnCoffee();
        System.out.println("Espresso: " + espresso);

        LatteBuilder latteBuilder = new LatteBuilder();
        director.constructCoffee(latteBuilder);
        Coffee latte = latteBuilder.returnCoffee();
        System.out.println("Latte: " + latte);

        CappuccinoBuilder cappuccinoBuilder = new CappuccinoBuilder();
        director.constructCoffee(cappuccinoBuilder);
        Coffee cappuccino = cappuccinoBuilder.returnCoffee();
        System.out.println("Cappuccino: " + cappuccino);
    }
}
