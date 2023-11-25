package com.lirianosclening.llc.Repositories;

import com.lirianosclening.llc.Models.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceProviderRepository extends JpaRepository<ServiceProvider, Long> {
}
