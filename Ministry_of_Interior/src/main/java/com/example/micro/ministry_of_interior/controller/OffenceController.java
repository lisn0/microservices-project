package com.example.micro.ministry_of_interior.controller;

import com.example.micro.ministry_of_interior.model.Offence;
import com.example.micro.ministry_of_interior.repository.OffenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/offence")
@RequiredArgsConstructor
public class OffenceController {

    private final OffenceRepository offenceRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Offence> findAll(){
        return offenceRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createOffence(@RequestBody Offence offence){
        offenceRepository.save(offence);
    }
}
