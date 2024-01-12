package behavioralpattern.observer.subjects;

import behavioralpattern.observer.observers.Observer;

public interface Service {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyAllObserver();
}
