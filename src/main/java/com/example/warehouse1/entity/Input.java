package com.example.warehouse1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Timestamp date;

    @ManyToOne
    private WareHouse wareHouse;

    @ManyToOne
    private Supplier supplier;

    @ManyToOne
    private Currency currency;

    @Column(nullable = false)
    private Integer factureNumber;

    @Column(nullable = false,unique = true)
    private String code;
}
