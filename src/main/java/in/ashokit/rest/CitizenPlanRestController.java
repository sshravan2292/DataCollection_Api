package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.CitizenPlan;
import in.ashokit.service.CitizenPlanService;

@RestController
public class CitizenPlanRestController {

	
	@Autowired
	private CitizenPlanService service;
	
	
	@GetMapping("/plans")
	public List<String> getPlanNames(){
		
		return service.getPlanNames();
		
	}
	
	@PostMapping("/plan")
	public String createCitizenPlan(@RequestBody CitizenPlan citizenPlan) {
		
		String status = service.saveCitizenPlan(citizenPlan);
		
		return status;
			
	}
	
}
