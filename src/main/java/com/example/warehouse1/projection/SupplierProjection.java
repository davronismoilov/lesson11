package com.example.warehouse1.projection;

import com.example.warehouse1.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface SupplierProjection {
    Integer getId();
    String getName();
    Boolean getActive();
    String getPhoneNumber();
}
