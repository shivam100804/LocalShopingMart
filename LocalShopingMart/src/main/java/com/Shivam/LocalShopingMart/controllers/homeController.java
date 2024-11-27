package com.Shivam.LocalShopingMart.controllers;


import com.Shivam.LocalShopingMart.models.customer;
import com.Shivam.LocalShopingMart.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {

    @GetMapping("/signup")
    public String customerSignup(){
        return "usersignup";
    }
    @GetMapping("/landing")
    public String landing(){
        return "landing";
    }
    @Autowired
    CustomerService cs;

    @PostMapping("/signupbtn")
    public String signUp(@ModelAttribute customer c1){
        try {
            cs.Signup(c1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "landing";
    }
    @GetMapping("/login")
    public String login() {
        return "landing"; // Return the name of your login view (e.g., a Thymeleaf or JSP page)
    }
}
