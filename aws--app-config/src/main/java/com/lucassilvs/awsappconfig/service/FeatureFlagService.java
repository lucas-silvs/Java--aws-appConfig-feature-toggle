package com.lucassilvs.awsappconfig.service;

import com.lucassilvs.awsappconfig.models.response.FeatureModelResponse;


public interface FeatureFlagService {


    FeatureModelResponse buscarFeature(String feature);
}
