package com.backend.product;

import java.util.Optional;

public interface ProductService {

    public void createNewProd(Product product);

    public Optional<Product> ProdDetail(Long prod_num);

    public void prodOrder();

}
