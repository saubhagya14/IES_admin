package com.org.ies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.ies.entity.CaseWorker;
import com.org.ies.entity.Plan;
import com.org.ies.service.AdminService;

@RestController("/admin")
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@PostMapping("/case-worker/register")
	public CaseWorker registerCaseWorker(@RequestBody CaseWorker caseWorker) {
		return adminService.registerCaseWorker(caseWorker);
	}
	
	@GetMapping("/view-case-worker")
	public List<CaseWorker> getCaseWorkers() {
		return adminService.getCaseWorkers();
	}
	
	@PutMapping("/case-worker/update")
	public CaseWorker updateCaseWorker(@RequestBody CaseWorker caseWorker) {
		return adminService.registerCaseWorker(caseWorker);
	
	}
	
	@PostMapping("/plan/regisrer")
	public Plan registerPlan(@RequestBody Plan plan) {
		return adminService.registerPlan(plan);
	}
	
	@GetMapping("/view-plan")
	public List<Plan> getPlans() {
		return adminService.getPlans();
	}
	
	@PutMapping("/plan/update")
	public Plan updatePlan(@RequestBody Plan plan) {
		return adminService.updatePlan(plan);
	
	}
	
}
