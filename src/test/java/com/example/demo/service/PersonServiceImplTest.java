package com.example.demo.service;

import com.example.demo.personDto.GroupByIdResponseDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceImplTest {
    GroupByIdResponseDto groupByIdResponseDto;

    @BeforeEach
     void createPersonServiceImpl() {
        groupByIdResponseDto = new GroupByIdResponseDto();
    }

    @Test
     void testGroupByIdResponseDto() {
        try {
            Method method = PersonServiceImpl.class.getDeclaredMethod("GroupByIdResponseDto");
            method.setAccessible(true);
            groupByIdResponseDto.setId(1);
            groupByIdResponseDto.setAge(22);
            groupByIdResponseDto.setName("Ivan");
            assertEquals(1,groupByIdResponseDto.getId());
            assertEquals(22,groupByIdResponseDto.getAge());
            assertEquals("Ivan",groupByIdResponseDto.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}