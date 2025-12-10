package ua.com.kisit.unit10.structural_patterns.adapter.v2;

public class Client implements UserDetails {

    private String username;
    private String password;

    @Override
    public String toString() {
        return "Client{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Client(String username, String password) {
        this.username = username;
    }

    public Client() {
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

    @Override
    public String getUser() {
        return username;
    }

    @Override
    public String getPass() {
        return password;
    }
}
