package com.Shivam.LocalShopingMart.repositories;


import com.Shivam.LocalShopingMart.models.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

public interface customerRepository extends JpaRepository<customer,Integer> {
    customer findByEmail(String email);
}
