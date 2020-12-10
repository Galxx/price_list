package com.gorokhov.client;

import com.gorokhov.common.ProductItem;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PriceControllerImpl implements PriceController {

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Override
    @RequestMapping("/price")
    public List<ProductItem> price() {

        ProductItem productItem = new ProductItem();
        productItem.setId(1L);
        productItem.setTitle("Tea");
        productItem.setAmount(12.0);
        productItem.setCurrency("USD");

        ProductItem productItem2 = new ProductItem();
        productItem2.setId(2L);
        productItem2.setTitle("Banana");
        productItem2.setAmount(13.0);
        productItem2.setCurrency("EUR");

        List<ProductItem> productItems=  new ArrayList<>();
        productItems.add(productItem);
        productItems.add(productItem2);

       return productItems;
    }

}
