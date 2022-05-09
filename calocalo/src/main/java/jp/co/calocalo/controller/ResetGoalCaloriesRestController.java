package jp.co.calocalo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.entity.AdminEntity;
import jp.co.calocalo.entity.EmployeesJoinAdminEntity;
import jp.co.calocalo.form.DemoResetForm;
import jp.co.calocalo.repository.AdminRepository;
import jp.co.calocalo.repository.EmployeesJoinAdminRepository;

@RestController
public class ResetGoalCaloriesRestController {

	@Autowired EmployeesJoinAdminRepository employeesAdminRepository;
	
	@Autowired AdminRepository adminRepository;
	
	@Autowired EmployeesJoinAdminRepository employeesJoinAdminRepository;

	//カロリーの再設定
	
	@PostMapping("/mypage/setting/{emp_id}")
	public  EmployeesJoinAdminEntity signUp(@PathVariable int emp_id, DemoResetForm form) {
		
		EmployeesJoinAdminEntity reCaloEntity = new EmployeesJoinAdminEntity();
		AdminEntity admin = adminRepository.getById(1);
		EmployeesJoinAdminEntity employee = employeesJoinAdminRepository.getById(emp_id);

		reCaloEntity.setEmp_id(emp_id);
		reCaloEntity.setGoal_calories(form.getGoal_calories());
		reCaloEntity.setAdminEntity(admin);
		reCaloEntity.setPassword(employee.getPassword());
		employeesAdminRepository.save(reCaloEntity);
		
		return reCaloEntity;
	}
}
