package com.sandbox.api.configuration;

import com.sandbox.domain.repository.AccountRepository;
import com.sandbox.domain.repository.CardRepository;
import com.sandbox.domain.repository.CountryRepository;
import com.sandbox.domain.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    CountryService countryService(CountryRepository countryRepository) {
        return new CountryServiceImpl(countryRepository);
    }

    @Bean
    AccountService accountService(AccountRepository accountRepository) {
        return new AccountServiceImpl(accountRepository);
    }

    @Bean
    CardService cardService(CardRepository cardRepository) {
        return new CardServiceImpl(cardRepository);
    }

}
