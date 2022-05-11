package jp.co.calocalo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.entity.AdminEntity;
import jp.co.calocalo.entity.EmployeesJoinAdminEntity;
import jp.co.calocalo.form.GoalCaloUpdateForm;
import jp.co.calocalo.repository.AdminRepository;
import jp.co.calocalo.repository.EmployeesJoinAdminRepository;

@RestController
public class ResetGoalCaloriesRestController {

	@Autowired EmployeesJoinAdminRepository employeesAdminRepository;
	
	@Autowired AdminRepository adminRepository;
	
	@Autowired EmployeesJoinAdminRepository employeesJoinAdminRepository;

	//カロリーの再設定
	@PutMapping("/mypage/setting/{emp_id}")
	public  void signUp(@PathVariable int emp_id, GoalCaloUpdateForm form) {
		
		EmployeesJoinAdminEntity reCaloEntity = new EmployeesJoinAdminEntity();
		AdminEntity admin = adminRepository.getById(1);
		EmployeesJoinAdminEntity employee = employeesJoinAdminRepository.getById(emp_id);

//		データの再代入からの保存
		reCaloEntity.setEmp_id(emp_id);
		reCaloEntity.setGoal_calories(form.getGoal_calorie());
		reCaloEntity.setAdminEntity(admin);
		reCaloEntity.setPassword(employee.getPassword());
		employeesAdminRepository.save(reCaloEntity);
	}
}
