package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.CitizenPlan;
import in.ashokit.repo.CitizenPlanRepository;


@Service
public class CitizenPlanServiceImpl implements CitizenPlanService {

	@Autowired
	public CitizenPlanRepository cpRepo;
	
	
	@Override
	public List<String> getPlanNames() {
		
		return cpRepo.getPlanNames();
	}


	@Override
	public String saveCitizenPlan(CitizenPlan citizenPlan) {


		citizenPlan = cpRepo.save(citizenPlan);
		
		if(citizenPlan.getCaseId()!=null) {
			
			return "CitizenPlan";
		}else {
			
			return "CitizenPlan Failed to save";
		}
		
		
	}

}
