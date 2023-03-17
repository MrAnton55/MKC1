package com.example.demo.service;

import com.example.demo.PersonDto.GroupByIdResponseDto;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonService {
    GroupByIdResponseDto getPersonById(int id);
}
