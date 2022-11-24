package com.sandbox.experimental.filter;


import com.sandbox.experimental.configuration.ServiceFeatures;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
@Order(1)
@Slf4j
@RequiredArgsConstructor
public class PrepareAppFilter implements Filter {

    private final ServiceFeatures serviceFeatures;

    @SneakyThrows
    @Override
    public void init(FilterConfig filterConfig) {
        sleep();
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request, response);
    }

    private void sleep() throws InterruptedException {
        log.info("Preparing App ...");
        Thread.sleep(serviceFeatures.getStartupDelaySeconds() * 1_000L);
        log.info("App started !!!");
    }
}
