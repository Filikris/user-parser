package ua.pp.kris.userparser;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String text = "programmer:vasia@123, programmer:vasia, vasia@1234, vasia";

        UserParser userParser = new UserParser();

        List<User> text2 = userParser.parseList(text);

        for (User user : text2) {
            System.out.println(user);
        }
    }

}
