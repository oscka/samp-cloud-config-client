package com.example.sampcloudconfigclient.controller;

import com.example.sampcloudconfigclient.service.DynamicConfigService;
import com.example.sampcloudconfigclient.service.StaticConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Autowired
    private StaticConfigService configStaticService;
    @Autowired
    private DynamicConfigService cofigDynamicService;

    @GetMapping(value = "/static")
    public Object getConfigFromStatic() {
        return configStaticService.getConfig();
    }

    @GetMapping(value = "/dynamic")
    public Object getConfigFromDynamic() {
        return cofigDynamicService.getConfig();
    }
}
