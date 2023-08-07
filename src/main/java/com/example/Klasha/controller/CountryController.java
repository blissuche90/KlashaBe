package com.example.Klasha.controller;

import com.example.Klasha.services.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class CountryController {
    private final CountryService countryEntityService;
    @GetMapping("/country")
    public void getCountryEntity(@RequestParam (value = "country") String country){
        countryEntityService.getCountryEntity(country);
    }
}
