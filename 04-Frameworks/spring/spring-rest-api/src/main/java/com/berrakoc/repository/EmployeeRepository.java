package com.berrakoc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.berrakoc.model.Employee;
import com.berrakoc.model.UpdateEmployeeRequest;

@Repository
public class EmployeeRepository {
	
	@Autowired
	private List<Employee> employeeList;

	public List<Employee> getAllEmployeeList(){
		
		return employeeList;
	}
	
	
	public Employee getEmployeeById(String id) {
		Employee foundEmployee = null;
		for (Employee employee : employeeList) {
			if(id.equals(employee.getId())) {
				foundEmployee= employee;
				break;
			}
		}
		return foundEmployee;
	}
	
	
	
	public List<Employee> getEmployeeWithParams(String firstName, String lastName) {
	    List<Employee> employeeWithParams = new ArrayList<>();

	    if (firstName == null && lastName == null) {
	        return employeeList; 
	    }

	    for (Employee employee : employeeList) {
	        if (firstName != null && lastName != null) {
	            if (employee.getFirstName().equalsIgnoreCase(firstName) &&
	                    employee.getLastName().equalsIgnoreCase(lastName)) {
	                employeeWithParams.add(employee);
	            }
	        }

	        if (firstName != null && lastName == null) {
	            if (employee.getFirstName().equalsIgnoreCase(firstName)) {
	                employeeWithParams.add(employee);
	            }
	        }

	        if (lastName != null && firstName == null) {
	            if (employee.getLastName().equalsIgnoreCase(lastName)) {
	                employeeWithParams.add(employee);
	            }
	        }
	    }

	    return employeeWithParams;
	}
	
	public Employee saveEmployee(Employee newEmployee) {
		employeeList.add(newEmployee);
		return newEmployee;
	}
	
	
	public boolean deleteEmployee(String id) {
		//delete from Employee WHERE id = id
		Employee deletedEmployee =null;
		 for(Employee employee : employeeList) {
			 if(id.equals(employee.getId())) {
				 deletedEmployee=employee;
				 break;
			 }
		 }
		 if(deletedEmployee==null) {
			 return false;
		 }
		 employeeList.remove(deletedEmployee);
		 return true;
	}
	
	//id ile employee bulan fonksiyon
	private Employee findEmployeeById(String id) {
		Employee foundEmployee = null;
		for (Employee employee : employeeList) {
			if(employee.getId().equals(id)){
				foundEmployee = employee;
				break;
			}
		}
		return foundEmployee;
	}
	
	public Employee updateEmployee(String id, UpdateEmployeeRequest request) {
		Employee foundEmployee = findEmployeeById(id);
		if(foundEmployee != null) {
			deleteEmployee(id);
			
			Employee updatedEmployee = new Employee();
			updatedEmployee.setId(id);
			updatedEmployee.setFirstName(request.getFirstName());
			updatedEmployee.setLastName(request.getLastName());
			
			employeeList.add(updatedEmployee);
			
			return updatedEmployee;
		}
		return null;
	}
	
	
	
	

}
