package com.ioc.ioc.repositories;

import java.util.List;

import com.ioc.ioc.models.Product;

public class ProductRepository {
    //SIMULACIÓN DE UNA BASE DE DATOS

    private List<Product> datos;

    public ProductRepository() {
        this.datos = List.of(
            new Product(1L, "Arroz", 5000L),
            new Product(2L, "Frijol", 6000L),
            new Product(3L, "Aceite", 7000L)
        );
    }

   
    private List<Product> findAll() {
        return datos;
    }
}
