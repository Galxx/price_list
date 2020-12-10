package com.gorokhov.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


@FeignClient("currency-service")
public interface CurrencyClient {

    @RequestMapping("/currency")
    Map<String,Double> currency();

}


