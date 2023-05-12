package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data // it will create toString , equals , hashCode , getters and setters
@Table(name = "StudentNew")
@NoArgsConstructor  // Creates an empty class constructor with all arguments.
@AllArgsConstructor // Create class constructor with all arguments
public class Student implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="Id")
    private Long id;

    @Column(name="age",nullable = false)
    private Integer age;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="email",unique = true)
    private String email;

}
