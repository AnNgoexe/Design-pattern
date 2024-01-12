package behavioralpattern.mediator.colleagues;

import behavioralpattern.mediator.mediators.Mediator;

public class ChatUser extends User {
    public ChatUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println("---");
        System.out.println(this.name + " is sending the message: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " received the message: " + msg);
    }
}
