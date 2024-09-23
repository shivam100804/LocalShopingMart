package com.Shivam.LocalShopingMart.controllers;


import com.Shivam.LocalShopingMart.models.Retailer;
import com.Shivam.LocalShopingMart.services.RetailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
//@RestController
@RequestMapping("/Retailer")
public class RetailerController {
    @Autowired
    RetailerService s1;
    @PostMapping("/signUpp")
    public String addRetailler(@ModelAttribute Retailer r1) {
        s1.addRetailer(r1);
        return "added successfully";
    }
    @GetMapping("/signup")
    public String index() {
        return "retailerLogin";
    }
}
