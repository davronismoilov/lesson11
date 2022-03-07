package com.example.warehouse1.entity;

import com.example.warehouse1.entity.template.Head;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Supplier extends Head {
    @Column(nullable = false,unique = true)
    private String phoneNumber;
}
