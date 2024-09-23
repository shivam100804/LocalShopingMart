package com.Shivam.LocalShopingMart.services;


import com.Shivam.LocalShopingMart.models.customer;
import com.Shivam.LocalShopingMart.repositories.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService
{

    @Autowired
    customerRepository c1;

    public void Signup(customer Customer) throws Exception {
        if(c1.findByEmail(Customer.getEmail())!=null){
            throw new Exception("user already registered");
        }
        c1.save(Customer);

    }
}
