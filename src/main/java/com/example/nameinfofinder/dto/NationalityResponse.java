package com.example.nameinfofinder.dto;

import com.example.nameinfofinder.entity.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NationalityResponse {
    private String name;
    private List<Country> country = new ArrayList<>(); // Use List instead of ArrayList
    private int count;
    
}
