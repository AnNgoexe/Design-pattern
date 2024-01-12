package behavioralpattern.responsibilitychain.handlers;

public class UsernameHandler extends AuthenticationHandler {
    public UsernameHandler(AuthenticationHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean authenticate(User user) {
        System.out.println("Checking username...");
        if(user.getUsername().equals("user@example.com")) {
            System.out.println("Checking username successfully");
            return authenticateNext(user);
        } else {
            System.out.println("Checking username failed");
            return false;
        }
    }
}
