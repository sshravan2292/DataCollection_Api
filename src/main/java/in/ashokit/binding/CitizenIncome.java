package in.ashokit.binding;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "INCOME_DETAILS")
public class CitizenIncome {

	
	private Double monthlySal;
	private Double rentIncome;
	private Double propertyIncome;
	
}
