package com.example.warehouse1.repository;

import com.example.warehouse1.entity.User;
import com.example.warehouse1.projection.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user",excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<User,Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
}
