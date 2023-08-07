package com.example.Klasha;

import com.example.Klasha.apiRequest.CountryStateRequest;
import com.example.Klasha.apiRequest.StateRequest;
import com.example.Klasha.apiResponse.CountryStateResponse;
import com.example.Klasha.apiResponse.StateResponse;
import com.example.Klasha.data.State;
import com.example.Klasha.services.serviceImplementation.StateServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class StateServiceImplementationTest {
    @Mock
    private RestTemplate restTemplate;

    @Value("${all.states.endpoint:https://countriesnow.space/api/v0.1/countries/states}")
    private String allStateApi;

    @Value("${all.cities.in.state.endpoint:https://countriesnow.space/api/v0.1/countries/state/cities}")
    private String allCitiesApi;
    @InjectMocks
    private StateServiceImplementation stateService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllStatesByCountry() {
        StateRequest request = new StateRequest();
        request.setCountry("Nigeria");
        StateResponse stateResponse = new StateResponse();
        State state1 = new State();
        state1.setName("Lagos");
        State state2 = new State();
        state2.setName("Anambra");
        stateResponse.getData().setState(Arrays.asList(state1, state2));

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        HttpEntity<StateRequest> entity = new HttpEntity<>(request, headers);

        ResponseEntity<StateResponse> response = restTemplate.exchange(allStateApi, HttpMethod.POST, entity, StateResponse.class);
        System.out.println("StateResponse : : " + response);

        stateService.getAllCityByState("Nigeria", "Lagos");

    }

    @Test
    public void testGetAllCityByState() {
        CountryStateResponse countryStateResponse = new CountryStateResponse();
        countryStateResponse.setData(Arrays.asList("Ojuelegba", "Ikorodu"));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        CountryStateRequest cityRequest = new CountryStateRequest();
        cityRequest.setState("Lagos");
        HttpEntity<CountryStateRequest> entity = new HttpEntity<>(cityRequest, headers);
        ResponseEntity<CountryStateResponse> stateResponse = restTemplate.exchange(allCitiesApi,HttpMethod.POST,entity,CountryStateResponse.class);
        System.out.println(stateResponse);
    }
}
