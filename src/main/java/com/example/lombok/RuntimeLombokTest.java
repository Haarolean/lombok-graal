package com.example.lombok;

import com.example.lombok.service.ConfigService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class RuntimeLombokTest {

    private final ConfigService configService;

    @SneakyThrows
    @PostConstruct
    public void init() {
        log.info("I'm up");
        var conf = configService.readConfig(ConfigService.CONFIG);
        log.info("Config value: [{}]", new ObjectMapper().writeValueAsString(conf));
    }

}
