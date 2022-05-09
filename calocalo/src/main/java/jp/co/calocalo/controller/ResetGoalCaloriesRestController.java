package jp.co.calocalo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.entity.EmployeesJoinAdminEntity;
import jp.co.calocalo.form.ResetGoalCaloriesForm;
import jp.co.calocalo.repository.EmployeesJoinAdminRepository;

@RestController
public class ResetGoalCaloriesRestController {

	
	@Autowired EmployeesJoinAdminRepository employeesAdminRepository;
	
	@PostMapping("/mypage/setting/{emp_id}")
	public void signUp(ResetGoalCaloriesForm goal_calories) {
		
		EmployeesJoinAdminEntity employeesAdminEntity = formToResetCalo(goal_calories);
		employeesAdminRepository.save(employeesAdminEntity);	
		
	}
	
	private EmployeesJoinAdminEntity formToResetCalo(ResetGoalCaloriesForm goal_calories) {
		EmployeesJoinAdminEntity reCaloEntity = new EmployeesJoinAdminEntity();
		reCaloEntity.setGoal_calories(goal_calories.getGoal_calories());
		
		return reCaloEntity;
		
		
	}
	
	
}
