package com.example.warehouse1.projection;

import com.example.warehouse1.entity.Input;
import com.example.warehouse1.entity.InputProduct;
import com.example.warehouse1.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(types = InputProduct.class)
public interface InputProductProjection {
    Integer getId();
    double getAmount();
    double getPrice();
    Date getExpireDate();
    Product getProduct();
    Input getInput();
}
