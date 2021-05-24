package com.example.dockertest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmploymentType {
    @Id
    @GeneratedValue
    private String id;

    @Column(unique = true)
    private String name;

    public EmploymentType(String name) {
        this.name = name;
    }
}
