package behavioralpattern.state.states;

import behavioralpattern.state.context.TrafficLight;

public class RedLightState implements State {
    @Override
    public void changeState(TrafficLight trafficLight) {
        System.out.println("Red light - stop! Wait for " + getWaitTime() + " seconds.");
        trafficLight.setState(new GreenLightState());
    }

    @Override
    public int getWaitTime() {
        return RED_LIGHT_WAIT_TIME;
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public void alert() {
        System.out.println("Alert: The light is red. Please stop!");
    }
}
