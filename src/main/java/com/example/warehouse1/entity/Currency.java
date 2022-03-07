package com.example.warehouse1.entity;

import com.example.warehouse1.entity.template.Head;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Currency extends Head {

}
