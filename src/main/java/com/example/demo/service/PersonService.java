package com.example.demo.service;

import com.example.demo.personDto.GroupByIdResponseDto;

public interface PersonService {
    GroupByIdResponseDto getPersonById(int id);
}
