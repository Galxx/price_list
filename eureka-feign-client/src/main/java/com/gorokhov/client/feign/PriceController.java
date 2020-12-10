package com.gorokhov.client.feign;

import com.gorokhov.common.ProductItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class PriceController {
    private SupplierClient supplierClient;
    private CurrencyClient currencyClient;

    @Autowired
    public void setGreetingClient(SupplierClient supplierClient,CurrencyClient currencyClient) {
        this.supplierClient = supplierClient;
        this.currencyClient = currencyClient;
    }

    //localhost:8190/price
    @RequestMapping("/price")
    public String greeting(Model model) {
        List<ProductItem> productItems = supplierClient.price();
        Map<String,Double> currency    = currencyClient.currency();

        for (ProductItem productItem: productItems) {
            productItem.setAmountRUB(productItem.getAmount()*currency.get(productItem.getCurrency()));
        }

        model.addAttribute("productItems", productItems);
        return "pricelist";
    }
}
