package com.lirianosclening.llc.Repositories;

import com.lirianosclening.llc.Models.MyService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMyServiceRepository extends JpaRepository<MyService, Long> {

}
