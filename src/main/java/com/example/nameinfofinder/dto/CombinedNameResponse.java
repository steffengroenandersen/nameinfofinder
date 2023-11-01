package com.example.nameinfofinder.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CombinedNameResponse {
    private String name;
    private int age;
    private String gender;
    private String country;
}
