package com.lucassilvs.awsappconfig.controller.impl;

import com.lucassilvs.awsappconfig.controller.FeatureFlagController;
import com.lucassilvs.awsappconfig.models.response.FeatureModelResponse;
import com.lucassilvs.awsappconfig.service.FeatureFlagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feature--flag")
public class FeatureFlagControllerImpl implements FeatureFlagController {

    @Autowired
    private FeatureFlagService featureFlagService;

    public ResponseEntity<FeatureModelResponse> buscarFeature(String nome) {
        return ResponseEntity.ok(featureFlagService.buscarFeature(nome));
    }
}
