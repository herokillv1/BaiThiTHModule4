package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Cities")
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private Float area;

    @Column(nullable=false)
    private Float population;

    @Column(nullable=false)
    private Float  gdp;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;

    @Column(nullable=false, columnDefinition="TEXT")
    private String introduce;

}
