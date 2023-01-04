package com.lucassilvs.awsappconfig.service.impl;

import com.lucassilvs.awsappconfig.models.response.FeatureModelResponse;
import com.lucassilvs.awsappconfig.service.FeatureFlagService;
import org.springframework.stereotype.Service;

@Service
public class FeatureFlagServiceImpl implements FeatureFlagService {

    @Override
    public FeatureModelResponse buscarFeature(String feature) {
        FeatureModelResponse response = new FeatureModelResponse();
        response.setNome("teste");
        response.setStatus(true);
        return  response;

    }
}
