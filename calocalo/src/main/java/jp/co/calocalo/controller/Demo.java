package jp.co.calocalo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.calocalo.entity.AdminEntity;
import jp.co.calocalo.entity.EmployeesJoinAdminEntity;
import jp.co.calocalo.form.SignUpForm;
import jp.co.calocalo.repository.AdminRepository;
import jp.co.calocalo.repository.EmployeesJoinAdminRepository;

@Controller
public class Demo {

	@Autowired EmployeesJoinAdminRepository employeesJoinAdminRepository;
	@Autowired AdminRepository adminRepository;
	
	@GetMapping("/")
	public String training() {
		return "demo/training";
	}
	
	
	@PostMapping("/post")
	public String signUp(SignUpForm signUpForm) {
		EmployeesJoinAdminEntity employeesJoinAdmin = formToAddEmployeesJoinAdminEntity(signUpForm);
		employeesJoinAdminRepository.save(employeesJoinAdmin);
		
		return "demo/training";
	}
	
	private EmployeesJoinAdminEntity formToAddEmployeesJoinAdminEntity(SignUpForm signUpForm) {
		
		EmployeesJoinAdminEntity employeesJoinAdmin = new EmployeesJoinAdminEntity();
	
		employeesJoinAdmin.setEmp_id(signUpForm.getEmpId());
		employeesJoinAdmin.setPassword(signUpForm.getPassword());
		employeesJoinAdmin.setGoal_calories(signUpForm.getGoal_calories());
		
		AdminEntity admin = new AdminEntity();
		admin.setAdmin_id(1);
//		admin.setAdmin_status("admin");
//		adminRepository.save(admin);
		employeesJoinAdmin.setAdminEntity(admin);
		
			return employeesJoinAdmin;
	}
}