package com.example.Klasha.apiResponse;

import com.example.Klasha.data.CapitalCityData;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class CountryCapitalCityResponse {
    private String error;
    private String msg;
    private CapitalCityData data;
}
