package in.ashokit.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passportId;
	private String  passportNum;
	private LocalDate issueDate;
	private LocalDate expDate;
	
	
	public Integer getPassportId() {
		return passportId;
	}


	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}


	public String getPassportNum() {
		return passportNum;
	}


	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}


	public LocalDate getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(LocalDate localDate) {
		this.issueDate = localDate;
	}


	public LocalDate getExpDate() {
		return expDate;
	}


	public void setExpDate(LocalDate localDate) {
		this.expDate = localDate;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	//mapping relation here...
	@OneToOne
	@JoinColumn(name="person_id")//it is the foregin key
	private Person person;

}
