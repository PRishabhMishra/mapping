package com.mapping.demo.mapping.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Student {
    @Id
    int id;
    String name;
    @OneToMany(mappedBy = "student")
    List<Laptop> laptops;
}
