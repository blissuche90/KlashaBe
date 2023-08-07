package com.example.Klasha.apiRequest;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DataRequest {
    private Long limit;
    private String order;
    private String orderBy;
    private String country;
}
