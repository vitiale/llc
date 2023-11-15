package com.lirianosclening.llc.Repositories;

import com.lirianosclening.llc.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ICustomer extends JpaRepository<Customer, Long> {

}
