package com.org.ies.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.ies.entity.Plan;

@Repository
public interface PlanRepo extends JpaRepository<Plan, Integer> {

}
