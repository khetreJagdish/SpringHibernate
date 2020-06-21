package com.scp.hibernate.HibernateOneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_CONTACT_INFO")
public class EmployeeContactInfo {
	
	@Id
	@GeneratedValue
	@Column(name="EMP_INFO_ID")
	private Long employInfoId;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="PHONE")
	private Long phone;

	
	
	public EmployeeContactInfo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public EmployeeContactInfo(Long employeeContactInfoId, String city, Long phone) {
		super();
		this.employInfoId = employeeContactInfoId;
		this.city = city;
		this.phone = phone;
	}



	public Long getEmployeeContactInfoId() {
		return employInfoId;
	}



	public void setEmployeeContactInfoId(Long employeeContactInfoId) {
		this.employInfoId = employeeContactInfoId;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public Long getPhone() {
		return phone;
	}



	public void setPhone(Long phone) {
		this.phone = phone;
	}
	
	
}
