package com.sandbox.experimental.collection;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;

@Component
public class ChronicleMap {

    @Value("${collections.chronicle.path}")
    private String chronicleMapPath;

    @SneakyThrows
    @PostConstruct
    public void setUp() {
        net.openhft.chronicle.map.ChronicleMap
                .of(String.class, String.class)
                .name("country-map")
                .entries(50)
                .averageValue("America")
                .averageKey("America")
                .createPersistedTo(new File(System.getProperty("user.home") + chronicleMapPath));
    }

}
