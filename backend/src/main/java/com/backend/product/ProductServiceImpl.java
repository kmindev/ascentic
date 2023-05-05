package com.backend.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public void create(Product product){
        productRepository.save(product);
    }

    @Override
    public void createNewProd(Product product) {

    }

    @Override
    public Optional<Product> ProdDetail(Long prod_num) {
        Optional<Product> product = productRepository.findById(prod_num);
        return product;
    }

    @Override
    public void prodOrder() {

    }
}
