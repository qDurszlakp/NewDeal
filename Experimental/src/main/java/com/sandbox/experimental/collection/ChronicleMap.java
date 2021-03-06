package com.sandbox.experimental.collection;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class ChronicleMap {

    private static final String CHRONICLE_MAP_PATH = "/Desktop/country-details.dat";

    private net.openhft.chronicle.map.ChronicleMap<String, String> persistedCountryMap;

    public ChronicleMap() {
        this.persistedCountryMap = setUp();
    }

    @SneakyThrows
    private net.openhft.chronicle.map.ChronicleMap<String, String> setUp() {
        return net.openhft.chronicle.map.ChronicleMap
                .of(String.class, String.class)
                .name("country-map")
                .entries(50)
                .averageValue("America")
                .averageKey("America")
                .createPersistedTo(new File(System.getProperty("user.home") + CHRONICLE_MAP_PATH));
    }

}
