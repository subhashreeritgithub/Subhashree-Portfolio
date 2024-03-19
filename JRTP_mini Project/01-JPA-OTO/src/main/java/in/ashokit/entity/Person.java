package in.ashokit.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  personId;
	private String personName;
	private Date personDob;
	private String personGender;
	
	//Mapping here ...
	@OneToOne(mappedBy="person",cascade =CascadeType.ALL)
	/* casecade- it is used here bcz all the chnges occured in parent class the same chnge will reflect in child class aslo
	 * 
	 */
	private Passport passport;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Date getPersonDob() {
		return personDob;
	}

	public void setPersonDob(Date personDob) {
		this.personDob = personDob;
	}

	public String getPersonGender() {
		return personGender;
	}

	public void setPersonGender(String personGender) {
		this.personGender = personGender;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public void setPersonDob(LocalDate minusYears) {
		// TODO Auto-generated method stub
		
	}

}
