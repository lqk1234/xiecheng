package com.example.weappdemo.controller;

import com.example.weappdemo.bean.SearchTrain;
import com.example.weappdemo.commer.ResponseData;
import com.example.weappdemo.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author lqk
 */
@RestController
public class TrainController {
    @Autowired
    private TrainService trainService;
    @GetMapping("/searchTrain")
    public ResponseData searchTrain(@RequestBody SearchTrain searchTrain) throws IOException {
        return trainService.searchTrain(searchTrain);
    }
}
