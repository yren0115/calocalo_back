package jp.co.calocalo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.entity.AdminEntity;
import jp.co.calocalo.entity.EmployeesJoinAdminEntity;
import jp.co.calocalo.form.SignUpForm;
import jp.co.calocalo.repository.EmployeesJoinAdminRepository;

@RestController
@RequestMapping("/signup")
public class SignUpRestController {

	@Autowired EmployeesJoinAdminRepository employeesJoinAdminRepository;
	
	@PostMapping
	public void signUp(SignUpForm signUpForm) {
		EmployeesJoinAdminEntity employeesJoinAdminEntity = formToAddEmployeesJoinAdminEntity(signUpForm);
		employeesJoinAdminRepository.save(employeesJoinAdminEntity);
		
	}
	
	private EmployeesJoinAdminEntity formToAddEmployeesJoinAdminEntity(SignUpForm signUpForm) {
		
		EmployeesJoinAdminEntity employeesJoinAdmin = new EmployeesJoinAdminEntity();
	
		employeesJoinAdmin.setEmp_id(signUpForm.getEmpId());
		employeesJoinAdmin.setPassword(signUpForm.getPassword());
		employeesJoinAdmin.setGoal_calories(signUpForm.getGoal_calories());
		
		AdminEntity userInfo = new AdminEntity();
		userInfo.setAdmin_id(1);
		employeesJoinAdmin.setAdminEntity(userInfo);		
		
		return employeesJoinAdmin;
	}
}