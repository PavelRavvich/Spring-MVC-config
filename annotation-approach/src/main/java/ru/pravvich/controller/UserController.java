package ru.pravvich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.pravvich.model.User;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Author : Pavel Ravvich.
 * Created : 11.08.17.
 * <p>
 * UserController
 */
@Controller
public class UserController {

    private final List<User> users = new CopyOnWriteArrayList<>();

    @RequestMapping(value = "/users/", method = RequestMethod.GET)
    public String showUsers(ModelMap model) {
//        model.addAttribute("users", users);
        return "users_view";
    }

}
