package org.rixon.nltt.controller;

import java.util.ArrayList;
import java.util.List;

import org.rixon.nltt.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class AppController {

    /**
     * Static list of users to simulate Database
     */
    private static List<User> userList = new ArrayList<User>();
 
    //Initialize the list with some data for index screen
    static {
        userList.add(new User(1, "Bill", "bill@email.com"));
        userList.add(new User(2, "Steve", "Jobs"));
        userList.add(new User(3, "Larry", "Page"));
        userList.add(new User(4, "Sergey", "Brin"));
        userList.add(new User(5, "Larry", "Ellison"));
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld() {
        return "hello";
    }
    
    
    /**
     * Saves the static list of users in model and renders it 
     * via freemarker template.
     * 
     * @param model 
     * @return The index view (FTL)
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(@ModelAttribute("model") ModelMap model) {
 
        model.addAttribute("userList", userList);
 
        return "index";
    }

}