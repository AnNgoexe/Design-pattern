package behavioralpattern.observer.subjects;

import behavioralpattern.observer.observers.LoginStatus;
import behavioralpattern.observer.observers.Observer;
import behavioralpattern.observer.observers.User;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements Service {

    private User user;
    private List<Observer> observers = new ArrayList<>();

    public AccountService(String email, String ip) {
        this.user = new User();
        this.user.setEmail(email);
        this.user.setIp(ip);
    }

    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(user);
        }
    }

    public void changeStatus(LoginStatus status) {
        user.setStatus(status);
        System.out.println("Status is changed");
        this.notifyAllObserver();
    }

    private boolean isValidIP() {
        String ip = "127.0.0.1";
        return ip.equals(user.getIp());
    }

    private boolean isValidEmail() {
        String email = "contact@gpcoder.com";
        return email.equalsIgnoreCase(user.getEmail());
    }

    public void login() {
        if (!this.isValidIP()) {
            user.setStatus(LoginStatus.INVALID);
        } else if (this.isValidEmail()) {
            user.setStatus(LoginStatus.SUCCESS);
        } else {
            user.setStatus(LoginStatus.FAILURE);
        }
        System.out.println("Login is handled");
        this.notifyAllObserver();
    }
}
