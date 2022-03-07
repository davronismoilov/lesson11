package com.example.warehouse1.repository;

import com.example.warehouse1.entity.Client;
import com.example.warehouse1.projection.ClientProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client",excerptProjection = ClientProjection.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
}
