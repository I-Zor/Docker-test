package com.example.dockertest.repositories;

import com.example.dockertest.models.EmploymentType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmploymentTypeRepository extends MongoRepository<EmploymentType, String> {

    Optional<EmploymentType> findByName(String name);
    void deleteByName(String name);
}
