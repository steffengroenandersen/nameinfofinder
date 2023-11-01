package com.example.nameinfofinder.dto;

import com.example.nameinfofinder.entity.Country;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class NationalityResponse {
    private String name;
    private ArrayList<Country> countries = new ArrayList<>();
    private int count;
    
}
