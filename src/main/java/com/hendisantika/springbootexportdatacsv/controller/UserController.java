package com.hendisantika.springbootexportdatacsv.controller;

import com.hendisantika.springbootexportdatacsv.data.UserService;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-export-data-csv
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/01/20
 * Time: 06.18
 */
@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
}
