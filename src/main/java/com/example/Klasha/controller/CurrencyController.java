package com.example.Klasha.controller;

import com.example.Klasha.apiRequest.CurrencyRequest;
import com.example.Klasha.services.serviceImplementation.CountryCurrServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class CurrencyController {
    private final CountryCurrServiceImplementation countryCurrencyService;

    @PostMapping("/convert-curency")
    public ResponseEntity<?> convertCurrency(@RequestBody CurrencyRequest request){
        return new ResponseEntity<>(countryCurrencyService.convertCurrency(request), HttpStatus.OK);
    }
}
