package behavioralpattern.mediator;

import behavioralpattern.mediator.colleagues.ChatUser;
import behavioralpattern.mediator.colleagues.User;
import behavioralpattern.mediator.mediators.ChatMediator;
import behavioralpattern.mediator.mediators.Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ChatMediator("Java design pattern");

        User admin = new ChatUser(mediator, "GP Coder");
        User user1 = new ChatUser(mediator, "User 1");
        User user2 = new ChatUser(mediator, "User 2");
        User user3 = new ChatUser(mediator, "User 3");

        mediator.addUser(admin);
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        admin.send("Hi All");
        user1.send("Hi Admin");
    }
}
