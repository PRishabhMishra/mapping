package com.mapping.demo.mapping.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Laptop {
    @Id
    int id;
    String name;
    @ManyToOne
    Student student;
}
