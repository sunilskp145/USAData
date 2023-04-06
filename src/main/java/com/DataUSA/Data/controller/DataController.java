package com.DataUSA.Data.controller;

import com.DataUSA.Data.response.DataResponse;
import com.DataUSA.Data.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    DataService dataService;

    @GetMapping("usaData")
    public DataResponse dataResponse(@RequestParam String drilldowns,@RequestParam String measures){
       DataResponse response = dataService.getResponse(drilldowns,measures);
       return response;
    }
}
