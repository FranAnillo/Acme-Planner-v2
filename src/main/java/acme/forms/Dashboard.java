package acme.forms;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dashboard implements Serializable{
	
	protected static final long	serialVersionUID	= 1L;
	

//	Double averegeExcutionPeriods;
//	Double deviationExcutionPeriods;
//	Integer minmumExecutionPeriod;
//	Integer maximumExecutionPeriod;



	Double numberOfPublicTask;
	Double numberOfPrivateTask;
	Double numberOfFinishTask;
	Double numberOfNotFinishTask;
	
	Integer minimumWorkload;
	Integer maximumWorkload;
	Double averageWorkload;
	Double deviationWorkload;
	

}
