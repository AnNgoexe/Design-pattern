package behavioralpattern.responsibilitychain.handlers;

public abstract class AuthenticationHandler {
    private AuthenticationHandler nextHandler;

    public AuthenticationHandler(AuthenticationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public static AuthenticationHandler link(AuthenticationHandler first, AuthenticationHandler... chain) {
        AuthenticationHandler head = first;
        for (AuthenticationHandler nextInChain : chain) {
            head.nextHandler = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean authenticate(User user);

    protected boolean authenticateNext(User user) {
        if (nextHandler == null) {
            return true;
        }
        return nextHandler.authenticate(user);
    }
}