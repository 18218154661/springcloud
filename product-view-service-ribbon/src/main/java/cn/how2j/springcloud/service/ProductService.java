package cn.how2j.springcloud.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.how2j.springcloud.client.ProductClientRibbon;
import cn.how2j.springcloud.pojo.Product;
/**
 * @description:
 * @author: congquan
 * @time: 2020/3/12 21:05
 */

@Service
public class ProductService {
    @Autowired ProductClientRibbon productClientRibbon;
    public List<Product> listProducts(){
        return productClientRibbon.listProdcuts();

    }
}