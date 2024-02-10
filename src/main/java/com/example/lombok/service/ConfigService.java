package com.example.lombok.service;

import com.example.lombok.dto.PullRequestConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ConfigService {

    public static final String CONFIG = "{\"baseTest\":\"baseTestVal\",\"prTest\":\"prTestVal\"}";

    private static final ObjectMapper configMapper = new ObjectMapper(new YAMLFactory());

    static {
//        configMapper.setPropertyNamingStrategy(PropertyNamingStrategies.KEBAB_CASE);
        configMapper.findAndRegisterModules();
    }

    public PullRequestConfig readConfig(String json) throws IOException {
        return configMapper.readValue(json, PullRequestConfig.class);
    }

}
