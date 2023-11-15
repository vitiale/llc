package com.lirianosclening.llc.Repositories;

import com.lirianosclening.llc.Models.Agreement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAgreement extends JpaRepository<Agreement, Long> {

}
