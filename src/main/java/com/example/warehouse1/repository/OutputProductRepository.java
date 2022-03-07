package com.example.warehouse1.repository;

import com.example.warehouse1.entity.OutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
    List<OutputProduct> findAllByOutputId(Integer output_id);

    List<OutputProduct> findAllByProductId(Integer product_id);


    @Query(nativeQuery = true,value = "select * from output_product op where op.output_id=?1 order by op.amount desc limit 1")
    OutputProduct maxOutputProduct(Integer id);

}
