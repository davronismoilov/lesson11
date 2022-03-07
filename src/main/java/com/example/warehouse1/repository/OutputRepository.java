package com.example.warehouse1.repository;


import com.example.warehouse1.entity.Output;
import com.example.warehouse1.projection.OutputProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "output",excerptProjection = OutputProjection.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {

}
