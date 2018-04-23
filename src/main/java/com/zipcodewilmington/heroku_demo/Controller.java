package com.zipcodewilmington.heroku_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World";
    }

}
