package com.example.warehouse1.repository;

import com.example.warehouse1.entity.Attachment;
import com.example.warehouse1.projection.AttachmentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment",collectionResourceRel = "Photos",excerptProjection = AttachmentProjection.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
