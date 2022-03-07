package com.example.warehouse1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OutputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private double price;

    @ManyToOne(optional = false)
    private Product product;

    @ManyToOne
    private Output output;
}
