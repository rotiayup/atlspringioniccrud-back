package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="countries")
@ToString @EqualsAndHashCode
public class Country {

    @Id
    @Getter @Setter @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter @Column(name="nomcountry")
    private String nomcountry;

    @OneToMany(mappedBy = "countryid")
    private List<City> listaCities;
}
