package com.example.warehouse1.repository;

import com.example.warehouse1.entity.InputProduct;
import com.example.warehouse1.projection.InputProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.sql.Timestamp;
import java.util.List;
@RepositoryRestResource(path = "inputProduct",excerptProjection = InputProductProjection.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
