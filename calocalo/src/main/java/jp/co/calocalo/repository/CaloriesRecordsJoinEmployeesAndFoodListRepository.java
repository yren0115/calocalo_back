package jp.co.calocalo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.calocalo.entity.CaloriesRecordsJoinEmployeesAndFoodListEntity;

public interface CaloriesRecordsJoinEmployeesAndFoodListRepository extends 
	JpaRepository<CaloriesRecordsJoinEmployeesAndFoodListEntity, Integer> {

}
