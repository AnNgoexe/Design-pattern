package behavioralpattern.mediator.mediators;

import behavioralpattern.mediator.colleagues.User;

public interface Mediator {
    void sendMessage(String msg, User user);

    void addUser(User user);
}
