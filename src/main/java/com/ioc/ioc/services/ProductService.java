package com.ioc.ioc.services;

import java.util.List;
import java.util.stream.Collectors;

import com.ioc.ioc.models.Product;
import com.ioc.ioc.repositories.ProductRepository;

public class ProductService {

    private ProductRepository repository = new ProductRepository();

    public List<Product> findAll(){
        return repository.findAll().stream().map( a -> {
            Double iva = a.getPrice() * 0.19;
            a.setPrice(iva.longValue());
            return a;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id){
        return repository.findById(id);
    }

}
