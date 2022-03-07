package com.example.warehouse1.projection;

import com.example.warehouse1.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CategoryProjection {

    Integer getId();
    String getName();
    Boolean getActive();
    Category getParentCategory();

}
