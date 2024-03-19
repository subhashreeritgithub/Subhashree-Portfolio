package in.ashokit.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.CitizenReports;
import in.ashokit.repo.CitizenPlanRepository;

@Component

public class DataLoader implements ApplicationRunner {
	
	
	@Autowired
	private  CitizenPlanRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		LocalDate ldt=LocalDate.now();
		System.out.println(ldt.now());
		CitizenReports c1= new CitizenReports();
	 //cash plan data
		c1.setcitizenName="subha";
		c1.setgender="female";
		c1.setplanName="cash";
		c1.setplanstatus="approved";
		c1.setplanStartDate(ldt.now());
		c1.setplanEndDate(ldt.now().plusMonths(6));
		c1.setbenifitAmt(5000.00);
		
		/*
		 * CitizenReports c2= new CitizenReports(); //cash plan data (denied records)
		 * only reason c2.setcitizenName=("priya"); c2.setgender=("female");
		 * c2.setplanName("cash"); c2.setplanstatus("Denied");
		 * c2.setplanStartDate(LocalDate.now());
		 * c2.setplanEndDate(LocalDate.now().plusMonths(6));
		 * c2.setDenialReason("Rental Income");
		 * 
		 * 
		 * CitizenReports c3= new CitizenReports(); //cash plan data treminated reason
		 * "employee c3.setcitizenName=("pooja"); c3.setgender=("female");
		 * c3.setplanName("cash"); c3.setplanstatus("terminated");
		 * c3.setplanStartDate(LocalDate.now().minusMonths(4));
		 * c3.setplanEndDate(LocalDate.now().plusMonths(6)); c3.setbenifitAmt(500.00);
		 * c3.setTerminatedDate(LocalDate.now()); c3.setterminationReason("Employee");
		 * 
		 * 
		 * 
		 * CitizenReports c4= new CitizenReports(); // Food plan
		 * c4.setcitizenName=("pintu"); c4.setgender=("male"); c4.setplanName("Food");
		 * c4.setplanstatus("approved"); c4.setplanStartDate(LocalDate.now());
		 * c4.setplanEndDate(LocalDate.now().plusMonths(6)); c4.setbenifitAmt(4000.00);
		 * 
		 * //
		 * 
		 * CitizenReports c5= new CitizenReports(); //cash plan data (denied records)
		 * only reason c5.setcitizenName=("litu"); c5.setgender=("male");
		 * c5.setplanName("Food"); c5.setplanstatus("Denied");
		 * c5.setplanStartDate(LocalDate.now());
		 * c5.setplanEndDate(LocalDate.now().plusMonths(6));
		 * c5.setDenialReason("property income");
		 * 
		 * // CitizenReports c6= new CitizenReports(); //cash plan data treminated
		 * reason "employee c6.setcitizenName=("himu"); c6.setgender=("male");
		 * c6.setplanName("Food"); c6.setplanstatus("terminated");
		 * c6.setplanStartDate(LocalDate.now().minusMonths(4));
		 * c6.setplanEndDate(LocalDate.now().plusMonths(6)); c6.setbenifitAmt(500.00);
		 * c6.setTerminatedDate(LocalDate.now()); c6.setterminationReason("Employee");
		 * 
		 * 
		 * CitizenReports c7= new CitizenReports(); // Food plan
		 * c7.setcitizenName=("papuni"); c7.setgender=("male");
		 * c7.setplanName("Medical"); c7.setplanstatus("approved");
		 * c7.setplanStartDate(LocalDate.now());
		 * c7.setplanEndDate(LocalDate.now().plusMonths(6)); c7.setbenifitAmt(3000.00);
		 * 
		 * 
		 * CitizenReports c8= new CitizenReports(); //cash plan data (denied records)
		 * only reason c8.setcitizenName=("guguly"); c8.setgender=("female");
		 * c8.setplanName("Medical"); c8.setplanstatus("Denied");
		 * c8.setplanStartDate(LocalDate.now());
		 * c8.setplanEndDate(LocalDate.now().plusMonths(6));
		 * c8.setDenialReason("property income");
		 * 
		 * 
		 * CitizenReports c9= new CitizenReports(); //Medical plan data treminated
		 * reason "employee c9.setcitizenName=("swati"); c9.setgender=("female");
		 * c9.setplanName("Medical"); c9.setplanstatus("terminated");
		 * c9.setplanStartDate(LocalDate.now().minusMonths(4));
		 * c9.setplanEndDate(LocalDate.now().plusMonths(6)); c9.setbenifitAmt(500.00);
		 * c9.setTerminatedDate(LocalDate.now()); c9.setterminationReason("Govt.Job");
		 * 
		 * 
		 * 
		 * CitizenReports c10= new CitizenReports(); // Food plan
		 * c10.setcitizenName=("pabitra"); c10.setgender=("male");
		 * c10.setplanName("Employment"); c10.setplanstatus("approved");
		 * c10.setplanStartDate(LocalDate.now());
		 * c10.setplanEndDate(LocalDate.now().plusMonths(6));
		 * c10.setbenifitAmt(6000.00);
		 * 
		 * 
		 * CitizenReports c11= new CitizenReports(); //cash plan data (denied records)
		 * only reason c11.setcitizenName=("Anupama"); c11.setgender=("female");
		 * c11.setplanName("Employment"); c11.setplanstatus("Denied");
		 * c11.setplanStartDate(LocalDate.now());
		 * c11.setplanEndDate(LocalDate.now().plusMonths(6));
		 * c11.setDenialReason("property income");
		 * 
		 * 
		 * CitizenReports c12= new CitizenReports(); //Medical plan data treminated
		 * reason "employee c12.setcitizenName=("Liza"); c12.setgender=("female");
		 * c12.setplanName("Employment"); c12.setplanstatus("terminated");
		 * c12.setplanStartDate(LocalDate.now().minusMonths(4));
		 * c12.setplanEndDate(LocalDate.now().plusMonths(6));
		 * c12.setbenifitAmt(7700.00); c12.setTerminatedDate(LocalDate.now());
		 * c12.setterminationReason("Govt.Job");
		 */
						
						
						
	List<CitizenReports>list=Arrays.asList(c1);
					
		repo.saveAll(list)	;
	}

}
