package ru.pravvich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author : Pavel Ravvich.
 * Created : 11.08.17.
 * <p>
 * UserController
 */
@Controller
public class UserController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String showUsers(ModelMap model) {
        model.addAttribute("hello", " world");
        return "hello_world";
    }
}
