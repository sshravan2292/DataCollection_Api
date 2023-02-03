package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.binding.CitizenIncome;

public interface CitizenIncomeRepository extends JpaRepository<CitizenIncome, Serializable> {

	
	
}
