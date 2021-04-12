package com.sandbox.api.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@Data
@ConfigurationProperties("service-config")
public class ServiceFeatures {

}
