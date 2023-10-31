package com.org.ies.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.ies.entity.CaseWorker;
@Repository
public interface CaseWorkerRepo extends JpaRepository<CaseWorker, Integer> {

}
