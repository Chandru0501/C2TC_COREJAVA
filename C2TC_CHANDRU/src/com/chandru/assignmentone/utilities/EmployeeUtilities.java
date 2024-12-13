package com.chandru.assignmentone.utilities;
import com.chandru.assignmentone.employee.Employee;
import com.chandru.assignmentone.employee.Manager;
import com.chandru.assignmentone.employee.Developer;

public class EmployeeUtilities {
	 public static void printEmployeeDetails(Employee employee) {
	        System.out.println("Name: " + employee.getName());
	        System.out.println("ID: " + employee.getEmployeeId());
	        System.out.println("Salary: " + employee.getSalary());
	    }


	    public static void printManagerDetails(Manager manager) {
	        printEmployeeDetails(manager);
	        System.out.println("Department: " + manager.getDepartment());
	    }


	    public static void printDeveloperDetails(Developer developer) {
	        printEmployeeDetails(developer);
	        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
	    }

}
