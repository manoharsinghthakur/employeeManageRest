package spring.rest.employeeManage.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import spring.rest.employeeManage.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(value="/employee/{empId}",method=RequestMethod.GET)
	public @ResponseBody String getEmployee(){
		return "hiiii";
		 
	}
	
	@RequestMapping(value="/employee" , method=RequestMethod.POST , consumes={"application/json"} , produces =  {"application/json"})
	@ResponseStatus(value=HttpStatus.CREATED)
	public @ResponseBody Employee createEmployee(@RequestBody Employee employee){
		System.out.println(employee.getFirstName());
		return employee;
	}
}
