package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.CitizenIncome;
import in.ashokit.service.CitizenIncomeService;

@RestController
public class CitizenIncomeRestController {

	
	@Autowired
	private CitizenIncomeService service;
	
	@PostMapping("/income")
	public String createCitizenIncome(@RequestBody CitizenIncome citizenIncome) {
		
		String status = service.saveCitizenIncome(citizenIncome);
		
		return status;
			
	}
}
