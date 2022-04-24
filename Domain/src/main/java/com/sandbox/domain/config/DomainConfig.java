package com.sandbox.domain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.Clock;

@Configuration
public class DomainConfig {

    @Bean
    public Clock clock() {
        return Clock.systemDefaultZone();
    }

    @Configuration
    @PropertySource(value = "classpath:application-domain.properties")
    static class DefaultDomainConfig {
    }

}
