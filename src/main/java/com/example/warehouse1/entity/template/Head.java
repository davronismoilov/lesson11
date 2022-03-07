package com.example.warehouse1.entity.template;

import lombok.Data;

import javax.persistence.*;


@Data
@MappedSuperclass
public class Head {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean active = true;
}
