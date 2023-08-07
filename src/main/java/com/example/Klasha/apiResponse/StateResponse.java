package com.example.Klasha.apiResponse;

import com.example.Klasha.data.CityData;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class StateResponse {
    private String error;
    private String msg;
    private CityData data;
}
