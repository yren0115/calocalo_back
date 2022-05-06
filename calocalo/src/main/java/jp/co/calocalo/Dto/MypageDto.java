package jp.co.calocalo.Dto;

import java.util.List;

import jp.co.calocalo.entity.FoodListEntity;

public class MypageDto {
	
	private int emp_id;
	private int goal_calorie;
	private int total_calorie;
	private List<FoodListEntity> foodList;
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getGoal_calorie() {
		return goal_calorie;
	}
	public void setGoal_calorie(int goal_calorie) {
		this.goal_calorie = goal_calorie;
	}
	public int getTotal_calorie() {
		return total_calorie;
	}
	public void setTotal_calorie(int total_calorie) {
		this.total_calorie = total_calorie;
	}
	public List<FoodListEntity> getFoodList() {
		return foodList;
	}
	public void setFoodList(List<FoodListEntity> foodList) {
		this.foodList = foodList;
	}
	
	
	
}
