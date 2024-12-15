package com.krishnaraj.assignment;
import com.krishnaraj.assignment.employees.Manager; 
import com.krishnaraj.assignment.employees.Developer; 
import com.krishnaraj.assignment.utilities.Employeeutilities;
public class Assignment {
	  public static void main(String[] args) { 
	        Manager manager = new Manager("John", 101, 90000, "Sales"); 
	        Developer developer = new Developer("Alice", 102, 80000, "Java"); 
	        EmployeeUtilities.printEmployeeDetails(manager); 
	        EmployeeUtilities.printEmployeeDetails(developer); 
	    }

}
