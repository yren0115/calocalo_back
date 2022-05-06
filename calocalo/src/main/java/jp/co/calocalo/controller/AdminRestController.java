package jp.co.calocalo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.entity.FoodListEntity;
import jp.co.calocalo.form.AdminFoodListForm;
import jp.co.calocalo.repository.EmployeesJoinAdminRepository;
import jp.co.calocalo.repository.FoodListRepository;

@RestController
@RequestMapping("/admin")
class AdminRestController {

	@Autowired FoodListRepository foodListRepository;
	@Autowired EmployeesJoinAdminRepository employeesJoinAdminRepository;
	
	@PostMapping
	public void registFoodAndCalories(AdminFoodListForm adminFoodListForm) {
		FoodListEntity foodListEntity = formToAddFoodListEntity(adminFoodListForm);
		foodListRepository.save(foodListEntity);
	}
	
	@DeleteMapping
	public void deleteEmployees(int empId) {
		employeesJoinAdminRepository.deleteById(empId);
	}
	
	private FoodListEntity formToAddFoodListEntity(AdminFoodListForm adminFoodList) {
		
		FoodListEntity foodListEntity = new FoodListEntity();
		foodListEntity.setFood_name(adminFoodList.getFood_name());
		foodListEntity.setCalories(adminFoodList.getCalories());

		return foodListEntity;
	}
}