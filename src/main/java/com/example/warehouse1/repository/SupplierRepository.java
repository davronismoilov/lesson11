package com.example.warehouse1.repository;

import com.example.warehouse1.entity.Supplier;
import com.example.warehouse1.projection.SupplierProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier",excerptProjection = SupplierProjection.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
}
