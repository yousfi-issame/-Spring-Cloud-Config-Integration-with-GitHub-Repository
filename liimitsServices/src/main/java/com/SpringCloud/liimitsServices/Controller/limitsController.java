package com.SpringCloud.liimitsServices.Controller;

import com.SpringCloud.liimitsServices.Bean.Limits;
import com.SpringCloud.liimitsServices.Configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class limitsController {
    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits retrieveLimites(){
        return new Limits(configuration.getMinimum(),
                configuration.getMaximum());

    }
}
