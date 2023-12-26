package com.example.EnocaBackendChallenge.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "address" , schema = "enoca")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;

    @Column(name = "street")
    private  String street ;

    @Column(name = "no")
    private  int no;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "description")
    private String description;

    @JsonIgnore
    @OneToOne(mappedBy = "address",cascade = {CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH})
    private Employee employee;
}

