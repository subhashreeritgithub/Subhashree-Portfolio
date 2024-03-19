package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  addressId;
	private String   city;
	private String   state;
	private String   country;
	
	@ManyToOne
	@JoinColumn (name="emp_id")
     private Employee emp; 
}
