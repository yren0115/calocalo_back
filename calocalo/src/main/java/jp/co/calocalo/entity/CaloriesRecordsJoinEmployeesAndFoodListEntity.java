package jp.co.calocalo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "calories_records")
public class CaloriesRecordsJoinEmployeesAndFoodListEntity {

	@Id
	private int record_id;
	
	@ManyToOne
	@JoinColumn(name = "emp_id", referencedColumnName = "emp_id")
	private EmployeesJoinAdminEntity employeesJoinAdminEntity;
	
	@ManyToOne
	@JoinColumn(name = "food_id", referencedColumnName = "food_id")
	private FoodListJoinNutritionEntity foodListJoinNutritionEntity;
	
	@Column
	private Date date;

	public int getRecord_id() {
		return record_id;
	}

	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}

	public EmployeesJoinAdminEntity getEmployeesJoinAdminEntity() {
		return employeesJoinAdminEntity;
	}

	public void setEmployeesJoinAdminEntity(EmployeesJoinAdminEntity employeesJoinAdminEntity) {
		this.employeesJoinAdminEntity = employeesJoinAdminEntity;
	}

	public FoodListJoinNutritionEntity getFoodListJoinNutritionEntity() {
		return foodListJoinNutritionEntity;
	}

	public void setFoodListJoinNutritionEntity(FoodListJoinNutritionEntity foodListJoinNutritionEntity) {
		this.foodListJoinNutritionEntity = foodListJoinNutritionEntity;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
