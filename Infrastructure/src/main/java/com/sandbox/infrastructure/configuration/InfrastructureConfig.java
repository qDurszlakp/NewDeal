package com.sandbox.infrastructure.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class InfrastructureConfig {

    @Configuration
    @PropertySource(value = "classpath:application-infrastructure.properties")
    static class DefaultInfrastructureConfig {
    }

}
