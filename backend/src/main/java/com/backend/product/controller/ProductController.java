package com.backend.product.controller;

import com.backend.product.service.ProductServiceImpl;
import com.backend.product.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductServiceImpl productServiceImpl;

    @PostMapping("/prodDetail")
    public void create(@RequestBody Product product){
        productServiceImpl.create(product);
    }

    @GetMapping("/prodDetail/{prod_num}")
    public Product prodDetail(@PathVariable("prod_num") Integer prodNum){
        Product product = productServiceImpl.ProdDetail(prodNum);
        return product;
    }

    @GetMapping("/listscent")
    public List<Product> getCategory(@RequestParam("category") String category){
        return productServiceImpl.getListByCategory(category);
    }
}
