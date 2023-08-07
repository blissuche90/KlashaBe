package com.example.Klasha.apiResponse;

import com.example.Klasha.data.CountryLocationData;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class CountryLocationResponse {
    private String error;
    private String msg;
    private CountryLocationData data;
}
