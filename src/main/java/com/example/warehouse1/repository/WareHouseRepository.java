package com.example.warehouse1.repository;

import com.example.warehouse1.entity.WareHouse;
import com.example.warehouse1.projection.WarehouseProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse",excerptProjection = WarehouseProjection.class)
public interface WareHouseRepository extends JpaRepository<WareHouse,Integer> {
    boolean existsByName(String name);
}
