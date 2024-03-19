package in.ashokit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Passport;
import in.ashokit.entity.Person;
import in.ashokit.repo.PassportRepo;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonService {
	@Autowired
	private PersonRepo personRepo;
	
	@Autowired
	private PassportRepo passportRepo;
	
	//write the method to save the data
	public void savePerson() {
	//create 1st the person object
		Person person= new Person();
		//set the data here
		//person data 
		person.setPersonName("subhashree");
		person.setPersonGender("female");
		person.setPersonDob(LocalDate.now().minusYears(20));
		person.setPersonGender("female");
		
		
	//create passport object ...
		//passport data
       Passport passport = new Passport();
       passport.setPassportNum("HJK6899HJ");
       passport.setIssueDate(LocalDate.now());
       passport.setExpDate(LocalDate.now().plusYears(10));
       
	//association
       //the person having which passport
       person.setPassport(passport);
       //the passport is which person
       passport.setPerson(person);
       
       //save parent
       // here.. we save the parent record the child record will save automatically bcz i have person entity ,the entity having relationship with passport..the relationship is onetoone relation 
       //passport is onetoone relation with person and it contains the fk in person table 
       personRepo.save(person);
	}
	
       public void getPerson() {
    	   personRepo.findById(1);
       }
       
    	   public void getPassport() {
    		   personRepo.findById(1);
    	   }
    	  
        
	

}