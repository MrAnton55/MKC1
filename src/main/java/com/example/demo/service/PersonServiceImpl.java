package com.example.demo.service;

import com.example.demo.PersonDto.GroupByIdResponseDto;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    @Override
    public GroupByIdResponseDto getPersonById(int id) {
        Optional<Person> byId = Optional.ofNullable(personRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("Пользователь не найден")));
        log.debug("person finded {} ", id);
        GroupByIdResponseDto groupByIdResponseDto = new GroupByIdResponseDto();
        groupByIdResponseDto.setId(byId.get().getId());
        groupByIdResponseDto.setName(byId.get().getName());
        groupByIdResponseDto.setAge(byId.get().getAge());
        return groupByIdResponseDto;
    }
}
