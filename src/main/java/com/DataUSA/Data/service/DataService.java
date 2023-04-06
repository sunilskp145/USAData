package com.DataUSA.Data.service;

import com.DataUSA.Data.response.DataResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class DataService {
    @Value("${Url}")
    private String usaUrl;

    public DataResponse getResponse(String drilldowns, String measures){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<DataResponse> response = new RestTemplate().exchange(usaUrl, HttpMethod.GET, entity, DataResponse.class);
        DataResponse genderResponse = response.getBody();

        return genderResponse;


    }
}
