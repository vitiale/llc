package com.lirianosclening.llc.Repositories;

import com.lirianosclening.llc.Models.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceProvider extends JpaRepository<ServiceProvider, Long> {
}
