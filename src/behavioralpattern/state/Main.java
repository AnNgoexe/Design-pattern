package behavioralpattern.state;

import behavioralpattern.state.context.TrafficLight;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        System.out.println("Initial state: " + trafficLight.getState().getColor());

        trafficLight.changeState();
        System.out.println("After 1st state change: " + trafficLight.getState().getColor());

        trafficLight.changeState();
        System.out.println("After 2nd state change: " + trafficLight.getState().getColor());

        trafficLight.changeState();
        System.out.println("After 3rd state change: " + trafficLight.getState().getColor());
    }
}
