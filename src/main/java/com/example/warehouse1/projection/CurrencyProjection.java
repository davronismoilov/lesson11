package com.example.warehouse1.projection;

import com.example.warehouse1.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CurrencyProjection {
    Integer getId();
    String getName();
    Boolean getActive();
}
