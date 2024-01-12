package behavioralpattern.responsibilitychain.handlers;

public class PasswordHandler extends AuthenticationHandler {
    public PasswordHandler(AuthenticationHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean authenticate(User user) {
        System.out.println("Checking password...");
        if(user.getPassword().equals("password123")) {
            System.out.println("Checking password successfully");
            return authenticateNext(user);
        } else {
            System.out.println("Checking password failed");
            return false;
        }
    }
}
