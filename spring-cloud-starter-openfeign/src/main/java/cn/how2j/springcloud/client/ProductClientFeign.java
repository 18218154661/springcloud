package cn.how2j.springcloud.client;

import cn.how2j.springcloud.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @description:
 * @author: congquan
 * @time: 2020/3/16 9:37
 */

@FeignClient(value="PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {
        @GetMapping("/products")
        public List<Product> listProdcuts();
}
