package com.org.ies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.ies.dao.CaseWorkerRepo;
import com.org.ies.dao.PlanRepo;
import com.org.ies.entity.CaseWorker;
import com.org.ies.entity.Plan;
import com.org.ies.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	CaseWorkerRepo caseWorkerRepo;
	@Autowired
	PlanRepo planRepo;
	
	@Override
	public CaseWorker registerCaseWorker(CaseWorker caseWorker) {
		return caseWorkerRepo.save(caseWorker);
	}

	@Override
	public List<CaseWorker> getCaseWorkers() {
		return caseWorkerRepo.findAll();
	}

	@Override
	public CaseWorker updateCaseWorker(CaseWorker caseWorker) {
		return caseWorkerRepo.save(caseWorker);
	}

	@Override
	public Plan registerPlan(Plan plan) {
		return planRepo.save(plan);
	}

	@Override
	public List<Plan> getPlans() {
		return planRepo.findAll();
	}

	@Override
	public Plan updatePlan(Plan plan) {
		return planRepo.save(plan);
	}

}
