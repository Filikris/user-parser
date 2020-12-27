package ua.pp.kris.userparser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserParser {

    public User parse(String user) {
        Pattern pattern = Pattern.compile("(?:(\\w+):)?([a-zA-Z]+)(?:@(\\w+))?");
        Matcher matcher = pattern.matcher(user);
        if (!matcher.matches()) {
            return null;
        }
        String nickname = matcher.group(1);
        String username = matcher.group(2);
        String password = matcher.group(3);

        return (nickname == null)
            ? new User(username, password)
            : new User(nickname, username, password);
    }

    public List<User> parseList(String usersWithComma) {
        String [] users = usersWithComma.split(",");
        List<User> userList = new ArrayList<User>();
        for (String user : users) {
            User newUser = parse(user.trim());
            userList.add(newUser);
        }

        return userList;
    }
}
