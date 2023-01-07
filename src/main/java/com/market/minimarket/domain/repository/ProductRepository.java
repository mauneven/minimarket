package com.market.minimarket.domain.repository;

import com.market.minimarket.domain.Product;
import com.market.minimarket.persistence.ProductoRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int cantidad);
    Optional<Product> getProduct (int productId);
    Product save (Product product);
    void delete (int productId);


}
