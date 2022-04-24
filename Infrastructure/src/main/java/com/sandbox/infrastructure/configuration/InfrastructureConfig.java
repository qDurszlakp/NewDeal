package com.sandbox.infrastructure.configuration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableCaching
public class InfrastructureConfig {

    public InfrastructureConfig() { }

    @Configuration
    @PropertySource(value = "classpath:application-infrastructure.properties")
    static class DefaultInfrastructureConfig {
    }

}
