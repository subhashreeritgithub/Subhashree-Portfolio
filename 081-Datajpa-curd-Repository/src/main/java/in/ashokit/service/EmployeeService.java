package in.ashokit.service;



import java.util.Arrays;
import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepo;

@Service
public class EmployeeService {
	private  EmployeeRepo empRepo;
	public EmployeeService(EmployeeRepo empRepo) {
		this.empRepo=empRepo;
		System.out.println(empRepo.getClass().getName());
		 
		
		}
	
	
	public void getEmp() {
		
	Optional<Employee> findById=empRepo.findById(3);
	if(findById.isPresent() ) {
		Employee employee=findById.get();
		System.out.println(employee);
	}
	}
	
	public void getEmps() {
		
		
		empRepo.findAllById(null);
	}
	
	
	
	
	
	
	
	 public void saveEmployee() {
		 Employee emp=new Employee();
		 emp.setEmpId(1);
		 emp.setEmpName("Subha");
		 emp.setEmpGender("female");
		 emp.setEmpDept("develpoer");
		 emp.setEmpSalary(1128.45);
		 
		 empRepo.save(emp);
		 
	}
	 public void saveMultipleEmployee() {
		 Employee emp1=new Employee();
		 emp1.setEmpId(2);
		 emp1.setEmpName("pooja");
		 emp1.setEmpGender("female");
		 emp1.setEmpDept("manager");
		 emp1.setEmpSalary(1234.56);
		 
		 Employee emp2= new Employee();
		 emp2.setEmpId(3);
		 emp2.setEmpName("sakunatla");
		 emp2.setEmpGender("female");
		 emp2.setEmpDept("developer");
		 emp2.setEmpSalary(1256.43);
		 
		 java.util.List<Employee> empsList =Arrays.asList(emp1,emp2);
		 
		 empRepo.saveAll(empsList);
	 }
	/* public void getEmpsBySalary(float salary) {
		 List emps=empRepo.findByEmpSalaryGreaterThan(salary);
		 ((Iterable<Employee>) emps).forEach(System.out::println);
	 }
	 */
	// public void getAllEmpsRecords() {
		// List<Employee> emps=empRepo.getAllEmpRecords();
		// emps.forEach(System.out.println());
	// }
	 
	public void getEmpById(Integer id) {
		Employee empById= empRepo.getEmpById(id);
		System.out.println(empById);
	}

}
