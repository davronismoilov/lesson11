package com.example.warehouse1.projection;

import com.example.warehouse1.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Attachment.class)
public interface AttachmentProjection {

    Integer getId();

    String getName();

    Long getSize();

    String getContentType();

}
