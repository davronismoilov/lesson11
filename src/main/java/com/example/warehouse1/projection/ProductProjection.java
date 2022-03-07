package com.example.warehouse1.projection;

import com.example.warehouse1.entity.Attachment;
import com.example.warehouse1.entity.Category;
import com.example.warehouse1.entity.Measurement;
import com.example.warehouse1.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface ProductProjection {
    Integer getId();
    String getName();
    Boolean getActive();
    Category getCategory();
    Attachment getPhoto();
    String getCode();
    Measurement getMeasurement();
}
