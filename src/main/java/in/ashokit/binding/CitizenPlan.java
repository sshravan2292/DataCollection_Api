package in.ashokit.binding;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "CITIZENS_PLANS_DETAILS")
public class CitizenPlan {

	

	private Integer caseId;
	
	private String planName;


}
