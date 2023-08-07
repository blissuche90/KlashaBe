package com.example.Klasha.apiResponse;

import com.example.Klasha.data.CountryCurrencyData;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class CountryCurrencyResponse {
    private String error;
    private String msg;
    private CountryCurrencyData data;
}
