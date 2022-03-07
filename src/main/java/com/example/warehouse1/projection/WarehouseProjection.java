package com.example.warehouse1.projection;

import com.example.warehouse1.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = WareHouse.class)
public interface WarehouseProjection {
    Integer getId();
    String getName();
    Boolean getActive();
}
