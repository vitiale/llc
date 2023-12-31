package com.lirianosclening.llc.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;
import java.util.HashSet;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "agreement")
public class Agreement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "responsible_full_name", nullable = false)
    private String responsibleFullName;

    @Column(name = "pay_frequency", nullable = false)
    private int payFrequency;

    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "end_date", nullable = false)
    private Date endDate;

    @Column(name = "cost", nullable = false)
    private Double cost;

    @Column(name = "note")
    private String note;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

    @OneToMany(mappedBy = "agreement")
    Set<MyService> myServices = new HashSet<>();

}
