package com.sandbox.api.configuration;

import com.sandbox.domain.repository.CountryRepository;
import com.sandbox.domain.service.CountryService;
import com.sandbox.domain.service.CountryServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    CountryService countryService(CountryRepository countryRepository) {
        return new CountryServiceImpl(countryRepository);
    }

}
