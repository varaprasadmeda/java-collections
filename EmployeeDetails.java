package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
				
		Employee emp1 = new Employee();
		emp1.setEmpId(1000);
		emp1.setEmpName("Aruna");
		emp1.setEmpDesignation("Software Devloper");
		emp1.setEmplSal(50000);
		

		
		empList.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setEmpId(1001);
		emp2.setEmpName("Prasad");
		emp2.setEmpDesignation("Oracle Devloper");
		emp2.setEmplSal(60000);
		
		empList.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setEmpId(1002);
		emp3.setEmpName("Vaseem");
		emp3.setEmpDesignation("Devops engineer");
		emp3.setEmplSal(70000);
		
		empList.add(emp2);
		
		
		//System.out.println(empList);
		
		//empList.forEach(e -> System.out.println(e));
		
		for(Employee e : empList) {
			System.out.println(e);
		}
		
		

	}

}
