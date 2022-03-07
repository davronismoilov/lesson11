package com.example.warehouse1.projection;

import com.example.warehouse1.entity.User;
import com.example.warehouse1.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(types = User.class)
public interface UserProjection {
    Integer getId();
    String getFirstname();
    String getLastname();
    String getPhoneNumber();
    String getCode();
    String getPassword();
    boolean getActive();
    List<WareHouse> getWareHouse();
}
