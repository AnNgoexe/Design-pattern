package behavioralpattern.mediator.mediators;

import behavioralpattern.mediator.colleagues.User;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {
    public ChatMediator(String groupName) {
        System.out.println(groupName + " group already created");
    }

    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        System.out.println(user.getName() + " joined this group");
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            if (!u.equals(user)) {
                u.receive(msg);
            }
        }
    }
}
