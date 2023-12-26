package com.example.EnocaBackendChallenge.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employee",schema = "enoca")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String LastName;

    @Column(name = "email")
    private String email;

    @Column(name = "salary")
    private double salary ;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address ;


}
