package jp.co.calocalo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.calocalo.entity.CaloriesRecordsJoinEmployeesEntity;


public interface CaloriesRecordsJoinEmployeesRepository extends 
	JpaRepository<CaloriesRecordsJoinEmployeesEntity, Integer> {

}
