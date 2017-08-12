package ru.pravvich;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author : Pavel Ravvich.
 * Created : 11.08.17.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String showUsers(ModelMap model) {
        model.addAttribute("world", " world");
        return "hello_world";
    }
}
