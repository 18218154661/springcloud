package cn.how2j.springcloud.web;
import java.util.List;

import cn.how2j.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.how2j.springcloud.service.ProductService;
/**
 * @description:
 * @author: congquan
 * @time: 2020/3/12 21:06
 */

@Controller
public class ProductController {

    @Autowired ProductService productService;

    @RequestMapping("/products")
    public Object products(Model m) {
        List<Product> ps = productService.listProducts();
        m.addAttribute("ps", ps);
        return "products";
    }
}