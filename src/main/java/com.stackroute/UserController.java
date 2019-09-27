package com.stackroute;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping
    public ModelAndView getValue(@RequestParam String Username, @RequestParam String Password){
        User user =new User();
        user.setName(Username);
        user.setPassword(Password);

        ModelAndView mv=new ModelAndView("display");
        mv.addObject("value",user.getName());
        mv.addObject("value1",user.getPassword());
        return mv;
    }
}
