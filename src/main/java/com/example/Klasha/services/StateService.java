package com.example.Klasha.services;

import com.example.Klasha.apiRequest.StateRequest;
import com.example.Klasha.apiResponse.CityCountryBaseResponse;

public interface StateService {
    CityCountryBaseResponse getAllStatesByCountry(StateRequest country);
}
