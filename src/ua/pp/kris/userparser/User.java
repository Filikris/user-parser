package ua.pp.kris.userparser;

public class User {

    private String nickname;
    private String username;
    private String password;

    public User(String nickname, String username, String password) {
        this.nickname = nickname;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        nickname = username;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User (nickname = "+nickname + ", username = " + username + ", password = " + password + ")";
    }
}
