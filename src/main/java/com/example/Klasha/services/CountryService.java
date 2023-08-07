package com.example.Klasha.services;

import com.example.Klasha.apiRequest.*;
import com.example.Klasha.apiResponse.*;

public interface CountryService {
    CountryResponse getCountryEntity(String country);
    CountryPopulationResponse getCountryPopulation(CountryPopulationRequest country);
    CountryCapitalCityResponse getCountryCapitalCities(CountryCapitalCityRequest country);
    CountryLocationResponse getCountryLocation(CountryLocationRequest country);
    CountryCurrencyResponse getCountryCurrency(CountryCurrencyRequest country);
    CountryIsoResponse getCountryIso(CountryIsoRequest country);
}
