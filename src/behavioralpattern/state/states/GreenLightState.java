package behavioralpattern.state.states;

import behavioralpattern.state.context.TrafficLight;

public class GreenLightState implements State {
    @Override
    public void changeState(TrafficLight trafficLight) {
        System.out.println("Green light - go! Wait for " + getWaitTime() + " seconds.");
        trafficLight.setState(new YellowLightState());
    }

    @Override
    public int getWaitTime() {
        return GREEN_LIGHT_WAIT_TIME;
    }

    @Override
    public String getColor() {
        return "Green";
    }

    @Override
    public void alert() {
        System.out.println("Alert: The light is green. You can go now!");
    }
}
