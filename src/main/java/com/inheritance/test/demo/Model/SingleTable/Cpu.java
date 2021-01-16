package com.inheritance.test.demo.Model.SingleTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("Cpu")
public class Cpu extends Item{
    private String model;
}
