package com.lirianosclening.llc.Models;

import com.lirianosclening.llc.Enums.ServiceEnums;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private ServiceEnums name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private ServiceProvider serviceProvider;
}
