package com.example.demo.personDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupByIdResponseDto {
    private int id;
    private int age;
    private String name;

}
