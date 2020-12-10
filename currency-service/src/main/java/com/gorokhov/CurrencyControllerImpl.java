package com.gorokhov;


import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class CurrencyControllerImpl implements CurrencyController {

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("currency-service")
    private String appName;

    @Override
    @RequestMapping("/currency")
    public Map<String,Double> currency() {

        Map<String,Double> currency = new HashMap<>();
        currency.put("USD",75.0);
        currency.put("EUR",85.0);

        return currency;
    }

}


