package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepo;

@Service
public class EmployeeService {
	private EmployeeRepo empRepo;
	public EmployeeService(EmployeeRepo empRepo) {
		this.empRepo=empRepo;
		System.out.println(this.empRepo.getClass().getName());
		
	}
	public void saveEmployee() {
		Employee emp=new Employee();
		emp.setEmpId(101);
		emp.setEmpName("subha");
		emp.setEmpGender("female");
		emp.setEmpDept("sales");
		emp.setEmpSalary(1500.00);
		empRepo.save(null);
		
	}

}
  