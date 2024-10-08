package com.idealstudy.eureka.client.product.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductTestController {

    @GetMapping("/has-user-role")
    @PreAuthorize("hasRole('USER')")
    public String getUser() {
        return "User";
    }

    @GetMapping("/has-admin-role")
    @PreAuthorize("hasRole('ADMIN')")
    public String getAdmin() {
        return "Admin";
    }

    @GetMapping("/has-no-role")
    public String getNoRole() {
        return "No Role";
    }

}
