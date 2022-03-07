package com.example.warehouse1.projection;

import com.example.warehouse1.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface MeasurementProjection {
    Integer getId();
    String getName();
    Boolean getActive();
}
