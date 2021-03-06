package com.sandbox.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("service-config")
public class ServiceFeatures {

    private String value;

}