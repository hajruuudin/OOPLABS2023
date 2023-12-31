package Task5;

public class YellowLightState implements TrafficLightState{
    @Override
    public void transitionToRed(TrafficLightContext context) {
        System.out.println("Going to red");
        context.setState(new RedLightState());
    }

    @Override
    public void transitionToYellow(TrafficLightContext context) {
        System.out.println("It is already in yellow");

    }

    @Override
    public void transitionToGreen(TrafficLightContext context) {
        System.out.println("Going to green");
        context.setState(new GreenLightState());
    }
}
