package com.inheritance.test.demo.Model.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Parameter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int parameterId;
    private String name;
}
