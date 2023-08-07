package com.example.Klasha.apiResponse;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class CountryStateResponse {
    private String error;
    private String msg;
    private List<String> data;
}
