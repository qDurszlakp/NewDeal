package com.sandbox.experimental.countdownlatch;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.CountDownLatch;

@Slf4j
public class Worker implements Runnable {
    private final List<String> outputScraper;
    private final CountDownLatch countDownLatch;

    Worker(List<String> outputScraper, CountDownLatch countDownLatch) {
        this.outputScraper = outputScraper;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        // Do some work
        log.info("Doing some logic");
        outputScraper.add("Counted down");
        countDownLatch.countDown();
    }
}
