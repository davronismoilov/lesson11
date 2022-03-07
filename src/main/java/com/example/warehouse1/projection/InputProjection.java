package com.example.warehouse1.projection;

import com.example.warehouse1.entity.Currency;
import com.example.warehouse1.entity.Input;
import com.example.warehouse1.entity.Supplier;
import com.example.warehouse1.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface InputProjection {
    Integer getId();
    Timestamp getDate();
    WareHouse getWareHouse();
    Supplier getSupplier();
    Currency getCurrency();
    Integer getFactureNumber();
    String getCode();
}
