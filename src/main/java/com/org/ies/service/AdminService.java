package com.org.ies.service;

import java.util.List;
import com.org.ies.entity.CaseWorker;
import com.org.ies.entity.Plan;


public interface AdminService {

	public CaseWorker registerCaseWorker(CaseWorker caseWorker);

	public List<CaseWorker> getCaseWorkers();

	public CaseWorker updateCaseWorker(CaseWorker caseWorker);

	public Plan registerPlan(Plan plan);

	public List<Plan> getPlans();

	public Plan updatePlan(Plan plan);
}
