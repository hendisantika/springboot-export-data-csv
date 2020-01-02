package com.hendisantika.springbootexportdatacsv.controller;

import com.hendisantika.springbootexportdatacsv.data.User;
import com.hendisantika.springbootexportdatacsv.data.UserService;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

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

    @GetMapping("/export-users")
    public void exportCSV(HttpServletResponse response) throws Exception {
        //set file name and content type
        String filename = "users.csv";

        response.setContentType("text/csv");
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + filename + "\"");

        //create a csv writer
        StatefulBeanToCsv<User> writer = new StatefulBeanToCsvBuilder<User>(response.getWriter())
                .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                .withOrderedResults(false)
                .build();

        //write all users to csv file
        writer.write(userService.listUsers());

    }
}
