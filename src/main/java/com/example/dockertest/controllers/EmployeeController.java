package com.example.dockertest.controllers;

import com.example.dockertest.models.Employee;
import com.example.dockertest.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService service;


    @GetMapping("")
    public List<Employee> getAll(){
    return service.findAll();
    }

    @PostMapping("/save")
    public String addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }


    @GetMapping("/findByName")
    public List<Employee> getByName(@RequestParam String firstName, @RequestParam String lastName){
        return service.findEmployee(firstName, lastName);
    }

    @GetMapping("/findBySocialSecurityNr")
    public Employee getBySocialSecurityNr(@RequestParam String socialSecurityNr){
        return service.findEmployeeBySocialSecurityNr(socialSecurityNr);
    }

    @GetMapping("/findByType")
    public List<Employee> getByType(@RequestParam String type){
        return service.getAllEmployeesByType(type);
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam String socialSecurityNr){
        return  service.deleteEmployee(socialSecurityNr);
    }

    @PostMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee){
        return service.updateEmployee(employee);
    }

}
