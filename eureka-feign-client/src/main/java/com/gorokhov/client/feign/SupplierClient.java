package com.gorokhov.client.feign;

import com.gorokhov.common.ProductItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@FeignClient("supplier-service")
public interface SupplierClient {
    @RequestMapping("/price")
    List<ProductItem> price();

}
