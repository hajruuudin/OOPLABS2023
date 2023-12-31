package Task5;

public class Main {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();

        // Simulate traffic light transitions
        context.transitionToGreen();
        context.transitionToYellow();
        context.transitionToRed();
        context.transitionToGreen();
        context.transitionToGreen(); //This one return that it is already in green
    }
}
