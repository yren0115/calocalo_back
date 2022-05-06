package jp.co.calocalo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.entity.FoodListEntity;
import jp.co.calocalo.repository.FoodListRepository;

@RestController
@RequestMapping("/mypage")
public class MainRestController {
	
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
	public Map<String, List<FoodListEntity>> mypage() {
		
		List<FoodListEntity> foodList = foodListRepository.findAll();
		
		Map<String, List<FoodListEntity>> foodListJson = new HashMap<>();
		foodListJson.put("food_list", foodList);
		
		return foodListJson;
	}



}
