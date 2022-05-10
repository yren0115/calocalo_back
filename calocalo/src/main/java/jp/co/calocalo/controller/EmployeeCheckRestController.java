package jp.co.calocalo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.repository.EmployeesJoinAdminRepository;

@RestController
@RequestMapping("/employee/check")
public class EmployeeCheckRestController {
	
	@Autowired
	EmployeesJoinAdminRepository EmployeeRepository;
	
	
//	emp_idがすでにあるかチェック
	@GetMapping("/{emp_id}")
	public Boolean employeeCheck(@PathVariable int emp_id) {
		
		if (EmployeeRepository.existsById(emp_id)) {
			Boolean existance = true;
			
			return existance;
		}else {
			Boolean existance = false;
			
			return existance;
			
		}
	}

}
