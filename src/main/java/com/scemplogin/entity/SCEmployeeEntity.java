package com.scemplogin.entity;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Immutable

@Table(name="sce_emp_view", schema="sce_admin")
public class SCEmployeeEntity {

	@Id
	@Column(name="emp_id")
	private int empId;
	
	@Column(name ="first_name")
	private String firstName;
	
	@Column(name ="last_name")
	private String lastName;
	
	private String email;
	
	private String password;
	
	@Column(name = "designation_name")
	private String designationName;
	
	private int isActive;
}
