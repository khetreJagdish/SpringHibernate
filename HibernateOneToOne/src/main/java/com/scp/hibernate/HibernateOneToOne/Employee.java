package com.scp.hibernate.HibernateOneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="EMPLOYEEDATA")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="EMPLOYEE_ID", nullable=false,unique=true)
	private Long employeeId;
	
	@Column(name="EMPLOYEE_FIRST_NAME")
	private String employeeFirstName;
	
	@Column(name="EMPLOYEE_LAST_NAME")
	private String employeeLastName;
	
	@OneToOne
	@Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	private EmployeeContactInfo employeeCInfo;
	
	

	public Employee() {
		super();
	}



	public Employee(Long employeeId, String employeeFirstName, String employeeLastName) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
	}



	public Long getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeFirstName() {
		return employeeFirstName;
	}



	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}



	public String getEmployeeLastName() {
		return employeeLastName;
	}



	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}



	public EmployeeContactInfo getEmployeeContactInfo() {
		return employeeCInfo;
	}



	public void setEmployeeContactInfo(EmployeeContactInfo employeeContactInfo) {
		this.employeeCInfo = employeeContactInfo;
	}
	
	
	
	
}
