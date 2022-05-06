package jp.co.calocalo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.entity.FoodListJoinNutritionEntity;
import jp.co.calocalo.entity.NutritionEntity;
import jp.co.calocalo.form.AdminFoodListForm;
import jp.co.calocalo.repository.EmployeesJoinAdminRepository;
import jp.co.calocalo.repository.FoodListJoinNutritionRepository;

@RestController
@RequestMapping("/admin")
class AdminRestController {

	@Autowired FoodListJoinNutritionRepository foodListJoinNutritionRepository;
	@Autowired EmployeesJoinAdminRepository employeesJoinAdminRepository;
	
	@PostMapping
	public void registFoodAndCalories(AdminFoodListForm adminFoodListForm) {
		FoodListJoinNutritionEntity foodListJoinNutritionEntity = formToAddFoodListNutritionEntity(adminFoodListForm);
		foodListJoinNutritionRepository.save(foodListJoinNutritionEntity);
	}
	
	@DeleteMapping
	public void deleteEmployees(int empId) {
		employeesJoinAdminRepository.deleteById(empId);
	}
	
	private FoodListJoinNutritionEntity formToAddFoodListNutritionEntity(AdminFoodListForm adminFoodList) {
		
		FoodListJoinNutritionEntity foodListJoinNutrition = new FoodListJoinNutritionEntity();
		foodListJoinNutrition.setFood_name(adminFoodList.getFood_name());
		
		NutritionEntity nutrition = new NutritionEntity();
		nutrition.setCalories(adminFoodList.getCalories());
		foodListJoinNutrition.setNutritionEntity(nutrition);
		return foodListJoinNutrition;
	}
}