package com.lirianosclening.llc.Repositories;

import com.lirianosclening.llc.Models.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceRepository extends JpaRepository<Service, Long> {

}
