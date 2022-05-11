package jp.co.calocalo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.repository.EmployeesJoinAdminRepository;

@RestController
@RequestMapping("admin/delete/employee")
public class AdminDeleteEmployeeRestController {
		
	@Autowired EmployeesJoinAdminRepository employeesRepository;
	
	@DeleteMapping("/{emp_id}")
	public void deleteEmployees(@PathVariable int emp_id) {
		employeesRepository.deleteById(emp_id);
	}

}
