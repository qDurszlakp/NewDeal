package com.sandbox.domain.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableCaching
public class DomainConfig {

    @Configuration
    @PropertySource(value = "classpath:application-domain.properties")
    static class DefaultDomainConfig {
    }

}
