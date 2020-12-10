package com.gorokhov.client;

import com.gorokhov.common.ProductItem;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface PriceController {
    @RequestMapping("/price")
    List<ProductItem> price();

}
