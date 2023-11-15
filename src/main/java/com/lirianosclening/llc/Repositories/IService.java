package com.lirianosclening.llc.Repositories;

import com.lirianosclening.llc.Models.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IService extends JpaRepository<Service, Long> {

}
