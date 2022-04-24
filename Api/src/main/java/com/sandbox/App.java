package com.sandbox;

import com.sandbox.api.configuration.ServiceFeatures;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EnableConfigurationProperties({ServiceFeatures.class})
public class App implements CommandLineRunner {

    public static void  main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {

    }
}
