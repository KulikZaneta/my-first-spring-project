package com.codefirstgirl.myfirstspringproject.controller;

import com.codefirstgirl.myfirstspringproject.config.AppProperties;
import com.codefirstgirl.myfirstspringproject.config.CfgProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AppController {
    private final AppProperties appProperties;
    private final CfgProperties cfgProperties;

    @GetMapping("/info")
    public String getInfo() {
        return appProperties.getMessage() + " from " + appProperties.getName()
                + " (website: " + cfgProperties.getWebsite() + ")";
    }
}

