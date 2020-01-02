package com.hendisantika.springbootexportdatacsv.data;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-export-data-csv
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/01/20
 * Time: 06.15
 */
@Service
public class UserService {

    public List<User> listUsers() {
        List<User> users = new ArrayList<>();

        //create dummy users
        users.add(new User(1, "Jet Lee", "jack@example.com", "China", 35));
        users.add(new User(2, "Bruce Lee", "brucelee@kungfu.me", "Hong Kong", 40));
        users.add(new User(3, "IP Man", "ipman@wingchun.com", "Hong Kong", 79));
        users.add(new User(4, "Scott Adkins", "scottadkin@karate.com", "USA", 52));

        return users;
    }
}