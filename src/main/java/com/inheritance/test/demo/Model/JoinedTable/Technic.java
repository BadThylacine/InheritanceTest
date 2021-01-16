package com.inheritance.test.demo.Model.JoinedTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Technic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int technicId;
    private String features;
}
