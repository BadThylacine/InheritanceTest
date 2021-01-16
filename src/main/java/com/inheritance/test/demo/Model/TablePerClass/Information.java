package com.inheritance.test.demo.Model.TablePerClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Information {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int informationId;
    private String shortInfo;
}
