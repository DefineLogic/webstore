package webshop;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import webshop.domain.ShoppingCart;


@FeignClient(name = "shopping-cart-query-service")
public interface ShoppingQueryCommandService {
    @RequestMapping("viewCartDetail/{cartNumber}")
    ShoppingCart getCartDetail(@PathVariable String cartNumber);
}
