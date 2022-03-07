package com.example.warehouse1.repository;

import com.example.warehouse1.entity.Input;
import com.example.warehouse1.projection.InputProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "input",excerptProjection = InputProjection.class)
public interface InputRepository extends JpaRepository<Input,Integer> {
    List<Input> findAllBySupplierId(Integer supplier_id);

    List<Input> findAllByCurrencyId(Integer currency_id);
    List<Input> findAllByWareHouseId(Integer wareHouse_id);
}
