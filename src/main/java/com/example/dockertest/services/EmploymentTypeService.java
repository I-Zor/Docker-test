package com.example.dockertest.services;


import com.example.dockertest.models.EmploymentType;
import com.example.dockertest.repositories.EmploymentTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EmploymentTypeService {

    private final EmploymentTypeRepository repository;

    public List<EmploymentType> findAll() {
        return repository.findAll();
    }

    public String addType(EmploymentType employmentType) {
        Optional<EmploymentType> temp = repository.findByName(employmentType.getName());
        if(temp.isEmpty()){
            repository.save(employmentType);
            return employmentType.getName() +  " är sparad.";
        }
        else
            return "Den anställningstyp finns redan";
    }

    public String deleteType(String name){
        repository.deleteByName(name);
        return "Du har raderat anställningstyp " + name;
    }

}
