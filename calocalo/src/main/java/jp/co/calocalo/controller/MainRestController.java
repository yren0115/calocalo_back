package jp.co.calocalo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.entity.FoodListJoinNutritionEntity;
import jp.co.calocalo.repository.FoodListJoinNutritionRepository;

@RestController
@RequestMapping("/mypage")
public class MainRestController {
	
	@Autowired
	FoodListJoinNutritionRepository foodListJoinNutritionRepository;
	
	
//	@GetMapping
//	public String mypage() {
//		
////		List<FoodListJoinNutritionEntity> foodList = new ArrayList<>();
////		foodList = foodListJoinNutritionRepository.findAll();
//		
//		
////		FoodListJoinNutritionEntity foodList = new FoodListJoinNutritionEntity();
//		
////		foodList.addAll(foodListJoinNutritionRepository.findAll());
//		
//		
////		long num = foodListJoinNutritionRepository.count();		
////		for (int i = 1; i < num; i++) {
////			
////			foodList.add(foodListJoinNutritionRepository.getById(i));
//////			foodList.getFood_name();
////		}
//		
//		long num = foodListJoinNutritionRepository.count();		
//		for (int i = 1; i < num; i++) {
//		
//		FoodListJoinNutritionEntity foodList = foodListJoinNutritionRepository.getById(i);
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
	
	
	@GetMapping
	public Map<String, List<FoodListJoinNutritionEntity>> toppage() {
		
		List<FoodListJoinNutritionEntity> foodList = foodListJoinNutritionRepository.findAll();
		
		Map<String, List<FoodListJoinNutritionEntity>> foodListJson = new HashMap<>();
		foodListJson.put("food_list", foodList);
		
		return foodListJson;
	}



}
