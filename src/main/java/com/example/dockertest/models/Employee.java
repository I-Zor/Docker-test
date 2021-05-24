package com.example.dockertest.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Employee {

    @Id
    @GeneratedValue
    private String id;

    private String firstName;
    private String lastName;
    private String gender;

    @Column(unique = true)
    private String socialSecurityNr;

    private double salary;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(referencedColumnName = "id")
    private EmploymentType employmentType;
    //private String department;
}
