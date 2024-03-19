package in.ashokit.entity;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="CITIZEN_PLAN_INFO")
public class CitizenReports {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer citizenId;
	private String citizenName;
	private String gender;
	private String planName;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Double benifitAmt;
	private String denialReason;
	private LocalDate terminateDate;
	private String terminationReason;
	public String setcitizenName;
	public String setgender;
	public String setplanName;
	public String setplanstatus;
	public void setplanStartDate(LocalDate now) {
		this.setplanStartDate(now);
		
	}
	public void setplanEndDate(LocalDate plusMonths) {
		this.setplanEndDate(plusMonths);
		
	}
	public void setbenifitAmt(double d) {
		this.setbenifitAmt(d);
		
	}
}