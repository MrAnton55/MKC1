package com.example.demo.controller;

import com.example.demo.personDto.GroupByIdResponseDto;
import com.example.demo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping(path = "/{id}")
    public GroupByIdResponseDto getPersonById(@PathVariable int id){
        return personService.getPersonById(id);
    }

}
