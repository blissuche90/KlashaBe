package com.example.Klasha.controller;

import com.example.Klasha.services.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class CitiesController {
    private final CityService cityService;

    @GetMapping("/top/cities")
    public ResponseEntity<?> getTopCities(@RequestParam(value = "number_of_cities") Long n){
        return new ResponseEntity<>(cityService.getAllCities(n), HttpStatus.OK);
    }
}
