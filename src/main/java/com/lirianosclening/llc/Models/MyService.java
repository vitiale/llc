package com.lirianosclening.llc.Models;

import com.lirianosclening.llc.Enums.ServiceEnums;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "service")
public class MyService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private ServiceEnums name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "sprovider_id")
    ServiceProvider serviceProvider;

    @ManyToOne
    @JoinColumn(name = "agreement_id")
    Agreement agreement;













    /*@ManyToOne
    @JoinColumn(name = "provider_id")
    private ServiceProvider serviceProvider;*/
}
