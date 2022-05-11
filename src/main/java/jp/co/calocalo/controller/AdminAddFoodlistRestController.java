package jp.co.calocalo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.entity.FoodListEntity;
import jp.co.calocalo.form.AdminFoodListForm;
import jp.co.calocalo.repository.EmployeesJoinAdminRepository;
import jp.co.calocalo.repository.FoodListRepository;

@RestController
@RequestMapping("/admin/add/foodlist")
class AdminAddFoodlistRestController {

	@Autowired FoodListRepository foodListRepository;
	@Autowired EmployeesJoinAdminRepository employeesJoinAdminRepository;
	
	@PostMapping
	public void registFoodAndCalories(AdminFoodListForm adminFoodListForm) {
		FoodListEntity newFood = formToAddFoodListEntity(adminFoodListForm);
		foodListRepository.save(newFood);
	}
	
	private FoodListEntity formToAddFoodListEntity(AdminFoodListForm adminFoodList) {
		
		FoodListEntity newFood = new FoodListEntity();
		newFood.setFood_name(adminFoodList.getFood_name());
		newFood.setCalories(adminFoodList.getFood_calorie());

		return newFood;
	}
	
	
}