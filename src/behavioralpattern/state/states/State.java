package behavioralpattern.state.states;

import behavioralpattern.state.context.TrafficLight;

public interface State {
    int RED_LIGHT_WAIT_TIME = 10;

    int GREEN_LIGHT_WAIT_TIME = 60;

    int YELLOW_LIGHT_WAIT_TIME = 5;

    void changeState(TrafficLight trafficLight);

    int getWaitTime();

    String getColor();

    void alert();
}
