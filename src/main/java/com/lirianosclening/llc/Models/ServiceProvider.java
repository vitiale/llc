package com.lirianosclening.llc.Models;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "service_provider")
public class ServiceProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "serviceProvider")
    private List<Service>services;
    //Set<Service>services = new HashSet<>();
}
