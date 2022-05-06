package jp.co.calocalo.Dto;

import java.util.List;

import jp.co.calocalo.entity.FoodListEntity;

public class MypageDto {
	
	private int emp_id;
	private int goalcalorie;
	private int takegfood_id;
	private String takefood_name;
	private int takefood_calorie;
	private List<FoodListEntity> foodList;
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getGoalcalorie() {
		return goalcalorie;
	}
	public void setGoalcalorie(int goalcalorie) {
		this.goalcalorie = goalcalorie;
	}
	public int getTakegfood_id() {
		return takegfood_id;
	}
	public void setTakegfood_id(int takegfood_id) {
		this.takegfood_id = takegfood_id;
	}
	public String getTakefood_name() {
		return takefood_name;
	}
	public void setTakefood_name(String takefood_name) {
		this.takefood_name = takefood_name;
	}
	public int getTakefood_calorie() {
		return takefood_calorie;
	}
	public void setTakefood_calorie(int takefood_calorie) {
		this.takefood_calorie = takefood_calorie;
	}
	public List<FoodListEntity> getFoodList() {
		return foodList;
	}
	public void setFoodList(List<FoodListEntity> foodList) {
		this.foodList = foodList;
	}
	
	
	
}
