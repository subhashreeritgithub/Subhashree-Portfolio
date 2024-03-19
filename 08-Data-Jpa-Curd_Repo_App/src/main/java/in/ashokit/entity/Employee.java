package in.ashokit.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class Employee {
	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empSalary
	 */
	public Double getEmpSalary() {
		return empSalary;
	}
	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	/**
	 * @return the empGender
	 */
	public String getEmpGender() {
		return empGender;
	}
	/**
	 * @param empGender the empGender to set
	 */
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	/**
	 * @return the empDept
	 */
	public String getEmpDept() {
		return empDept;
	}
	/**
	 * @param empDept the empDept to set
	 */
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	@Id
	private Integer empId;
	private String empName;
	private Double empSalary;
	private String empGender;
	private String empDept;
	
	

}
