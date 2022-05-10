package jp.co.calocalo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.entity.FoodListEntity;
import jp.co.calocalo.repository.FoodListRepository;

@RestController
@RequestMapping("/food_list")
public class FoodListRestController {
	
	@Autowired
	FoodListRepository foodListRepository;
	
	@GetMapping
	public List<FoodListEntity> findFoodList() {
		
		List<FoodListEntity> foodList = foodListRepository.findAll();
		
		return foodList;
	}
}
