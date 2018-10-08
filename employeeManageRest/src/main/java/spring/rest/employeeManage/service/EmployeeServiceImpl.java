package spring.rest.employeeManage.service;

import java.util.ArrayList; 
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import spring.rest.employeeManage.model.Employee;

/*public class EmployeeServiceImpl implements EmployeeService{
	
	private static final AtomicInteger EMPLOYEE_COUNTER = new AtomicInteger();
	private static List<Employee> employees = new ArrayList<Employee>();
	
	@Override
	public Employee create(Employee employee) {
		return employees.add(createEmployee(employee));
	}
	
	public int getEmployeeId(){
		return EMPLOYEE_COUNTER.incrementAndGet();
		
	}
	
	public Employee createEmployee(Employee employee) {
		Employee employee2 = new Employee();
		employee2.setEmpId(getEmployeeId());
		employee2.setFirstName(employee.getFirstName());
		employee2.setLastName(employee.getLastName());
		employee2.setDesignation(employee.getDesignation());
		return employee2;
	}

	

	
}
*/