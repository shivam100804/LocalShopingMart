package com.Shivam.LocalShopingMart.controllers;


import com.Shivam.LocalShopingMart.models.customer;
import com.Shivam.LocalShopingMart.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customer")
public class customerController {
    @Autowired
    CustomerService cs;

    @PostMapping("signUpp")
    public String signUp(@ModelAttribute customer c1){
        try {
            cs.Signup(c1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "userlogin";
    }
    @GetMapping("/signup")
    public String index() {
        return "usersignup";
    }
    @GetMapping("/login")
    public String login() {
        return "userlogin";
    }

}
