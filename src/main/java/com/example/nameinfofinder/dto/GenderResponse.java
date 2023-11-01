package com.example.nameinfofinder.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GenderResponse {
    private String name;
    private String gender;
    private double probability;
    private int count;
    
}
