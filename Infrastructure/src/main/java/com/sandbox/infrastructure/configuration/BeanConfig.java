package com.sandbox.infrastructure.configuration;

import com.sandbox.domain.repository.CountryRepository;
import com.sandbox.domain.service.CountryService;
import com.sandbox.domain.service.CountryServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class BeanConfig {

    @Configuration
    @PropertySource(value = "classpath:application-infrastructure.properties")
    static class DefaultConfig { }

    @Bean
    CountryService countryService(CountryRepository countryRepository) {
        return new CountryServiceImpl(countryRepository);
    }

}
