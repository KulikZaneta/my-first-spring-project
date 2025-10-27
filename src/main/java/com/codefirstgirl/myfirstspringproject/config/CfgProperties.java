package com.codefirstgirl.myfirstspringproject.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "cfg")
public class CfgProperties {
    private String website;
}

