package jp.co.calocalo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.Dto.MypageDto;
import jp.co.calocalo.entity.EmployeesJoinAdminEntity;
import jp.co.calocalo.entity.FoodListEntity;
import jp.co.calocalo.repository.EmployeesJoinAdminRepository;
import jp.co.calocalo.repository.FoodListRepository;

@RestController
@RequestMapping("/mypage/{emp_id}")
public class MainRestController {
	
	@Autowired
	EmployeesJoinAdminRepository employeesRepository;
	@Autowired
	FoodListRepository foodListRepository;
	
	
//	@GetMapping
//	public String mypage() {
//		
//		List<FoodListEntity> foodList = new ArrayList<>();
////		foodList = foodListRepository.findAll();
////		
////		
////		FoodListEntity foodList = new FoodListEntity();
////		
////		foodList.addAll(foodListRepository.findAll());
////		
////		
////		long num = foodListRepository.count();		
////		for (int i = 1; i < num; i++) {
////			
////			foodList.add(foodListRepository.getById(i));
//////			foodList.getFood_name();
////		}
//		
//		long num = foodListRepository.count();		
//		for (int i = 1; i < num; i++) {
//		
//		FoodListEntity foodList = foodListRepository.getById(i);
//		int foodId = foodList.getFood_id();
//		String foodName = foodList.getFood_name();
//		
//		List<Integer> foodListArray = new ArrayList<>();
//		 foodListArray.add(foodId);
//		
//		}
//		
//		return "1";
//	}
//	
	
	@GetMapping
	public String mypage(@PathVariable int emp_id) {
		
		MypageDto mypageDto = new MypageDto();
		
		List<FoodListEntity> foodList = foodListRepository.findAll();
		
		EmployeesJoinAdminEntity user = employeesRepository.getById(emp_id);
		
		int nowEmpId = user.getEmp_id ();
		int nowEmpGoalCalorie = user.getGoal_calorie();
		
		
		
		
		
		
		mypageDto.setFoodList(foodList);
		
		return "";
	}



}
