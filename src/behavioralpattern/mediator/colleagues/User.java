package behavioralpattern.mediator.colleagues;

import behavioralpattern.mediator.mediators.Mediator;

public abstract class User {
    protected Mediator mediator;
    protected String name;

    public User(Mediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return name.equals(user.name);
    }

    public String getName() {
        return this.name;
    }
}
