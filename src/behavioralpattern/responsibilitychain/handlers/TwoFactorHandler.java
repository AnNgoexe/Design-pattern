package behavioralpattern.responsibilitychain.handlers;

public class TwoFactorHandler extends AuthenticationHandler {
    public TwoFactorHandler(AuthenticationHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean authenticate(User user) {
        System.out.println("Checking two-factor authentication...");
        if(user.getTwoFactorCode().equals("134321")) {
            System.out.println("Checking two-factor authentication successfully");
            return authenticateNext(user);
        } else {
            System.out.println("Checking two-factor authentication failed");
            return false;
        }
    }
}
