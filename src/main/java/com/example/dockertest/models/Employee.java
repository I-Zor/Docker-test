package com.example.dockertest.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Employee {



    private String id;

    private String firstName;
    private String lastName;
    private String gender;


    private String socialSecurityNr;

    private double salary;



    private EmploymentType employmentType;
    //private String department;
}
