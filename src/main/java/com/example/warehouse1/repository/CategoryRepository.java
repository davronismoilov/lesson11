package com.example.warehouse1.repository;

import com.example.warehouse1.entity.Category;
import com.example.warehouse1.projection.CategoryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path = "category",excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
    boolean existsByNameAndParentCategoryId(String name, Integer parentCategory_id);
    List<Category> findAllByParentCategoryId(Integer parentCategory_id);
    boolean existsByParentCategoryId(Integer parentCategory_id);
}
