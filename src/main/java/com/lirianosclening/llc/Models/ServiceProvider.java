package com.lirianosclening.llc.Models;


import jakarta.persistence.*;
import lombok.*;

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

    @Column(name = "description")
    String description;

    @OneToMany(mappedBy = "serviceProvider")
    private List<MyService> myServices;
    //Set<Service>services = new HashSet<>();
}
