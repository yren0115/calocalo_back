package jp.co.calocalo.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.calocalo.entity.CaloriesRecordsJoinEmployeesEntity;
import jp.co.calocalo.entity.EmployeesJoinAdminEntity;
import jp.co.calocalo.form.UpdateTotalCaloriesForm;
import jp.co.calocalo.repository.CaloriesRecordsJoinEmployeesRepository;
import jp.co.calocalo.repository.EmployeesJoinAdminRepository;

@RestController
@RequestMapping("submit/food")
public class UpdateTotalCaloriesRestController {
	
	@Autowired
	CaloriesRecordsJoinEmployeesRepository caloriesRecordsRepository;
	
	@Autowired
	EmployeesJoinAdminRepository employeesRepository;
	
	@PostMapping("/{emp_id}")
	@Nullable
	public CaloriesRecordsJoinEmployeesEntity updateTotalCalories(@PathVariable int emp_id, UpdateTotalCaloriesForm updateTotalCaloriesForm) {
		
		Date date = updateTotalCaloriesForm.getDate();
		Integer takeFoodCalorie = updateTotalCaloriesForm.getTakeFoodCalorie();
		
		Integer totalCalories = caloriesRecordsRepository.findByDateAndEmpId(date, emp_id);
		CaloriesRecordsJoinEmployeesEntity getCaloriesRecords = caloriesRecordsRepository.findRecordsByDateAndEmpId(date, emp_id);
		
		CaloriesRecordsJoinEmployeesEntity newCaloriesRecords = new CaloriesRecordsJoinEmployeesEntity();
		EmployeesJoinAdminEntity employee = employeesRepository.getById(emp_id);
		
		if (totalCalories != null) {
			Integer newTotalCalories = totalCalories + takeFoodCalorie;
			
			newCaloriesRecords.setRecord_id(getCaloriesRecords.getRecord_id());
			newCaloriesRecords.setEmployeesJoinAdminEntity(employee);
			newCaloriesRecords.setTotal_calories(newTotalCalories);
			newCaloriesRecords.setDate(date);
			
			caloriesRecordsRepository.save(newCaloriesRecords);
			
			return newCaloriesRecords;
		}else {
			
			newCaloriesRecords.setEmployeesJoinAdminEntity(employee);
			newCaloriesRecords.setTotal_calories(takeFoodCalorie);
			newCaloriesRecords.setDate(date);
			
			caloriesRecordsRepository.save(newCaloriesRecords);
			
			return newCaloriesRecords;
			
		}
		
	}

}
