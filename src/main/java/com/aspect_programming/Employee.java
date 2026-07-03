package com.aspect_programming;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Employee {

    @GetMapping("/details")
    public String getEmployeeDetails() {
        return "Employee details";
    }
}
