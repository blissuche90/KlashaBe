package com.example.Klasha.apiResponse;

import com.example.Klasha.data.Data;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DataResponse {
    private boolean error;
    private String msg;
    private List<Data> data;
}
