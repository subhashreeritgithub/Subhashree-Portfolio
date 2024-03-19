package in.ashokit.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Customer;

@RestController
public class CustomerRestController {
@GetMapping("/msg")	
	public Customer getMsg(){
	Customer c= new Customer(1,"subhashree","spdarsini2000@gmail.com");
	
		
		return c;
		
	}
@GetMapping("/customers")
 public List<Customer> getCustomers(){
	 Customer c1= new Customer(1,"subha","subha@gmail.com");
	 Customer c2= new Customer(2,"pooja","subhasoo@gmail.com");
	 Customer c3= new Customer(3,"guguly","guguly@gmail.com");
	  List<Customer> customers= Arrays.asList(c1,c2,c3);
	return customers;
	 
 }

//post mapping concept example
@PostMapping("/customer")
public String addCustomer(@RequestBody Customer c) {
	System.out.println(c);
	return "Customer added";
}

@PutMapping("/updateCustomer")
 public String updateCustomer(@RequestBody Customer c) {
	 System.out.println(c);
	 return "Customer Update";
 }
@DeleteMapping("/deleteCustomer/{cid}")
public String deleteCustomer(@PathVariable Integer cid) {
 return "Customer deleted";
}


}
