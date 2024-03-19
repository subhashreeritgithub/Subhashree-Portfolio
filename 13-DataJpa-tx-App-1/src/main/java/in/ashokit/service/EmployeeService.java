package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.Repo.AddressRepo;
import in.ashokit.Repo.EmpRepo;
import in.ashokit.entity.Address;
import in.ashokit.entity.Emp;
import in.ashokit.entity.Emp;

@Service
public class EmployeeService {
	public EmployeeService(EmpRepo empRepo, AddressRepo addrRepo) {
		super();
		this.empRepo = empRepo;
		this.addrRepo = addrRepo;
	}
	private EmpRepo empRepo;
	private AddressRepo addrRepo;
public  void saveData() {  
	Emp emp= new Emp();
	emp.setEname("pooja");
	emp.setEsal(2234.56);
	 Emp savedEntity=empRepo.save(emp);
	
	Address add=new Address() ;
	add.setCity("Hyd");
	add.setState("tg");
	add.setCountry("india");
	add.setType("present");
	add.setEid(savedEntity.getEid());
 	addrRepo.save(add);
}
}
