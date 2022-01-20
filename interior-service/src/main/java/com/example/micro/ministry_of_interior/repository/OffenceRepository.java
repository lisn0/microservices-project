package com.example.micro.ministry_of_interior.repository;

import com.example.micro.ministry_of_interior.model.Offence;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OffenceRepository extends MongoRepository<Offence, String> {
    Offence findOffenceById(String Id);

    Offence findByCin(String cin);
}
