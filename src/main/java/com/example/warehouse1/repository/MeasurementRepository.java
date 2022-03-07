package com.example.warehouse1.repository;

import com.example.warehouse1.entity.Measurement;
import com.example.warehouse1.projection.MeasurementProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement",excerptProjection = MeasurementProjection.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
    boolean existsByName(String name);
}
