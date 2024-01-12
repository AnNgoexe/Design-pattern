package behavioralpattern.responsibilitychain;

import behavioralpattern.responsibilitychain.handlers.*;

public class Main {
    public static void main(String[] args) {
        AuthenticationHandler usernameHandler = new UsernameHandler(null);
        AuthenticationHandler passwordHandler = new PasswordHandler(null);
        AuthenticationHandler twoFactorHandler = new TwoFactorHandler(null);

        AuthenticationHandler authenticationChain = AuthenticationHandler.link(
                usernameHandler, passwordHandler, twoFactorHandler);

        boolean isAuthenticated = authenticationChain.authenticate(new User("user@example.com", "password123", "142354"));
        if (isAuthenticated) {
            System.out.println("User successfully authenticated.");
        } else {
            System.out.println("Authentication failed.");
        }
    }
}
