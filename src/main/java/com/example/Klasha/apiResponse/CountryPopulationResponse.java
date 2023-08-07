package com.example.Klasha.apiResponse;

import com.example.Klasha.data.CountryPopulationData;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class CountryPopulationResponse {
    private String error;
    private String msg;
    private CountryPopulationData data;
}
