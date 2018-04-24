package com.zipcodewilmington.heroku_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {

    @Autowired
    CityDAO cityDAO;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/cities")
    @ResponseBody
    public Iterable<City> cities() {
        return cityDAO.findAll();
    }

    @ExceptionHandler(Throwable.class)
    public String handleAnyException(Throwable ex, HttpServletRequest request) {
        return ClassUtils.getShortName(ex.getClass());
    }

}
