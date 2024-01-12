package behavioralpattern.state.context;

import behavioralpattern.state.states.RedLightState;
import behavioralpattern.state.states.State;

public class TrafficLight {
    private State state;

    public TrafficLight() {
        state = new RedLightState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeState() {
        state.changeState(this);
    }

    public State getState() {
        return state;
    }

    public void alert() {
        state.alert();
    }
}
