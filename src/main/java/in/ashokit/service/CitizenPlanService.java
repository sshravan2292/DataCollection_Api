package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.CitizenPlan;

public interface CitizenPlanService {

	public List<String> getPlanNames();
	
	public String saveCitizenPlan(CitizenPlan citizenPlan);
	

}
