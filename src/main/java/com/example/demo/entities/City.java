package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="cities")
@ToString @EqualsAndHashCode
public class City {

    @Id
    @Getter @Setter @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter @Column(name="nomcity")
    private String nomcity;

    @ManyToOne
    @Getter @Setter @JoinColumn(name="countryid")
    private Country countryid;

    @OneToMany(mappedBy = "cityid")
    private List<Customer> listaCustomers;
}
