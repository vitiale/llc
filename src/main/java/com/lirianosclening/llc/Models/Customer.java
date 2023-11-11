package com.lirianosclening.llc.Models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.aot.generate.GeneratedTypeReference;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "isCommercial", nullable = false)
    private boolean isCommercial;

    @Column(name = "address", nullable = false)
    private String address;

}
