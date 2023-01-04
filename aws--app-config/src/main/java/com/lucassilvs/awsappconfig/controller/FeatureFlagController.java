package com.lucassilvs.awsappconfig.controller;

import com.lucassilvs.awsappconfig.models.response.FeatureModelResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface FeatureFlagController {



    @GetMapping
    ResponseEntity<FeatureModelResponse> buscarFeature(@RequestParam(name = "feature") String nome);
}
