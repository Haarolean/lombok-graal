package com.example.lombok;

import com.example.lombok.service.ConfigService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Slf4j
public class ConfigTest {

    private ConfigService configService;

    @Test
    public void testConfigParsingOk() {
        try {
            var config = configService.readConfig(ConfigService.CONFIG);
            Assert.notNull(config, "config null");
        } catch (Exception e) {
            log.error("Error", e);
            Assertions.fail(e.getMessage());
        }
    }


}