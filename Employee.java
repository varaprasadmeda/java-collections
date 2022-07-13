package com.java.collection;

public class Employee {

	int empId;
	String empName;
	String empDesignation;
	double emplSal;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public double getEmplSal() {
		return emplSal;
	}

	public void setEmplSal(double emplSal) {
		this.emplSal = emplSal;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation + ", emplSal="
				+ emplSal + "]";
	}	

}
