package com.sandbox.infrastructure.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class Config {

    @Configuration
    @PropertySource(value = "classpath:application-infrastructure.properties")
    static class DefaultConfig {
    }

}
