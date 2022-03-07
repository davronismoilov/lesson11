package com.example.warehouse1.repository;

import com.example.warehouse1.entity.Currency;
import com.example.warehouse1.projection.CurrencyProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency",excerptProjection = CurrencyProjection.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
    boolean existsByName(String name);

}
