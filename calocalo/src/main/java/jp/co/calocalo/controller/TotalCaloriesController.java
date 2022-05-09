package jp.co.calocalo.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.Dto.TotalCaloriesDto;
import jp.co.calocalo.form.DateForm;
import jp.co.calocalo.repository.CaloriesRecordsJoinEmployeesRepository;

@RestController
@RequestMapping("/take_calorie")
public class TotalCaloriesController {
	
	@Autowired
	CaloriesRecordsJoinEmployeesRepository caloriesRecordsRepository;

	@PostMapping("/{emp_id}")
	@Nullable
	public TotalCaloriesDto takeTotalCalories(@PathVariable int emp_id, DateForm dateForm) {
		
		Date date = dateForm.getDate();
		Integer totalCalories = caloriesRecordsRepository.findByDateAndEmpId(date, emp_id);
		TotalCaloriesDto totalCaloriesDto = new TotalCaloriesDto();
		
		if (totalCalories != null) {
			totalCaloriesDto.setTotal_calories(totalCalories);
			totalCaloriesDto.setDate(date);
			totalCaloriesDto.setExistance(true);
			
			return totalCaloriesDto;
		}else {
			
			totalCaloriesDto.setTotal_calories(null);
			totalCaloriesDto.setDate(null);
			totalCaloriesDto.setExistance(false);
			
			return totalCaloriesDto;
		}
		
	}
	
}
