package com.gorokhov;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

public interface CurrencyController {

    @RequestMapping("/currency")
    Map<String,Double> currency();


}
