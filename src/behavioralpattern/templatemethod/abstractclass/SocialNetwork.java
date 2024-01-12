package behavioralpattern.templatemethod.abstractclass;

public abstract class SocialNetwork {
    protected String userName;

    protected String password;

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    protected abstract boolean logIn(String userName, String password);

    protected abstract boolean sendData(byte[] data);

    protected abstract void logOut();

    public boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }
}
