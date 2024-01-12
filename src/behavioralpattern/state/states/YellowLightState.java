package behavioralpattern.state.states;

import behavioralpattern.state.context.TrafficLight;

public class YellowLightState implements State {
    @Override
    public void changeState(TrafficLight trafficLight) {
        System.out.println("Yellow light - prepare to stop! Wait for " + getWaitTime() + " seconds.");
        trafficLight.setState(new RedLightState());
    }

    @Override
    public int getWaitTime() {
        return YELLOW_LIGHT_WAIT_TIME;
    }

    @Override
    public String getColor() {
        return "Yellow";
    }

    @Override
    public void alert() {
        System.out.println("Alert: The light is yellow. Please prepare to stop!");
    }
}
