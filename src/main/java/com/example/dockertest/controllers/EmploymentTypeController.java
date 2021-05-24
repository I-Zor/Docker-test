package com.example.dockertest.controllers;

import com.example.dockertest.models.EmploymentType;
import com.example.dockertest.services.EmploymentTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/type")
public class EmploymentTypeController {

    private final EmploymentTypeService service;

    @GetMapping("")
    public List<EmploymentType> getAll(){
        return service.findAll();
    }

    @PostMapping("/save")
    public String addType(@RequestBody EmploymentType employmentType){
        return service.addType(employmentType);
    }

    @GetMapping("/delete")
    public String deleteType(@RequestParam String name){
        return service.deleteType(name);
    }

}
