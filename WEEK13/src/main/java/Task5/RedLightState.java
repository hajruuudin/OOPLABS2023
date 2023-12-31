package Task5;

public class RedLightState implements TrafficLightState{
    @Override
    public void transitionToRed(TrafficLightContext context) {
        System.out.println("It is already red");
    }

    @Override
    public void transitionToYellow(TrafficLightContext context) {
        System.out.println("Going to yellow");
        context.setState(new YellowLightState());

    }

    @Override
    public void transitionToGreen(TrafficLightContext context) {
        System.out.println("Going to green");
        context.setState(new GreenLightState());
    }
}
