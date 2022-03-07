package com.example.warehouse1.repository;

import com.example.warehouse1.entity.Product;
import com.example.warehouse1.projection.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "product",excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
