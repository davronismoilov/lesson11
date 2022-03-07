package com.example.warehouse1.projection;

import com.example.warehouse1.entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface ClientProjection {
    Integer getId();
    String getName();
    String getPhoneNumber();
}
