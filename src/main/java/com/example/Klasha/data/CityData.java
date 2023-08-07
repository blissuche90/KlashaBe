package com.example.Klasha.data;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class CityData {
    private String name;
    private String iso2;
    private String iso3;
    private List<State> state;
}
