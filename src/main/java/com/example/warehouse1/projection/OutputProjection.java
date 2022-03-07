package com.example.warehouse1.projection;

import com.example.warehouse1.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface OutputProjection {
    Integer getId();
    Timestamp getDate();
    WareHouse getWareHouse();
    Client getClient();
    Currency getCurrency();
    Integer getFactureNumber();
    String getCode();
}
