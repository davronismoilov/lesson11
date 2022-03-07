package com.example.warehouse1.entity;

import com.example.warehouse1.entity.template.Head;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Product extends Head {

    @ManyToOne
    private Category category;

    @OneToOne
    private Attachment photo;

    @Column(nullable = false,unique = true)
    private String code;

    @ManyToOne
    private Measurement measurement; //o'lchov birligi
}
