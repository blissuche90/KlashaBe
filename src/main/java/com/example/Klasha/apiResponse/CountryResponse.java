package com.example.Klasha.apiResponse;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class CountryResponse {
    private CountryCapitalCityResponse capital;
    private CountryIsoResponse iso;
    private CountryLocationResponse location;
    private CountryPopulationResponse population;
    private CountryCurrencyResponse currency;

}
