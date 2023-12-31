package Task5;

public class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext() {
        this.state = new RedLightState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void transitionToRed() {
        state.transitionToRed(this);
    }

    public void transitionToGreen() {
        state.transitionToGreen(this);
    }

    public void transitionToYellow() {
        state.transitionToYellow(this);
    }
}
