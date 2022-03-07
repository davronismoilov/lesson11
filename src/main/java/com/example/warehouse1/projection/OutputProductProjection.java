package com.example.warehouse1.projection;

import com.example.warehouse1.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(types = OutputProduct.class)
public interface OutputProductProjection {
    Integer getId();
    double getAmount();
    double getPrice();
    Product getProduct();
    Output getOutput();
}
