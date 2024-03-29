package behavioralpattern.responsibilitychain.handlers;

public class User {
    private String username;
    private String password;
    private String twoFactorCode;

    public User(String username, String password, String twoFactorCode) {
        this.username = username;
        this.password = password;
        this.twoFactorCode = twoFactorCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTwoFactorCode() {
        return twoFactorCode;
    }

    public void setTwoFactorCode(String twoFactorCode) {
        this.twoFactorCode = twoFactorCode;
    }
}
