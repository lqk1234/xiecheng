package com.example.weappdemo.service;

import com.example.weappdemo.bean.SearchTrain;
import com.example.weappdemo.commer.ResponseData;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author lqk
 */
@Service
public interface TrainService {

    ResponseData searchTrain(SearchTrain searchTrain) throws IOException;
}
