package in.ashokit.repo;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Employee;

public interface EmployeeRepo  extends CrudRepository<Employee,Integer>{
	public List findByEmpSalaryGreaterThan (float salary);
	@Query("from Employee")
	public List getAllEmpRecords();
	
	
@Query("from Employee where empId=:id")

public Employee getEmpById(Integer id);
}

