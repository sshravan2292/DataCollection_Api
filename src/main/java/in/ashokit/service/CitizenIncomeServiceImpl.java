package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;

import in.ashokit.binding.CitizenIncome;
import in.ashokit.repo.CitizenIncomeRepository;

public class CitizenIncomeServiceImpl implements CitizenIncomeService {

	@Autowired
	public CitizenIncomeRepository ciRepo;

	@Override
	public String saveCitizenIncome(CitizenIncome citizenIncome) {

		citizenIncome = ciRepo.save(citizenIncome);
		
		return "Income saved";

			}

}
