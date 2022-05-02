package jp.co.calocalo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nutrition")
public class NutritionEntity {

	@Id
	private int nutrition_id;
	
	@Column
	private int calories;

	public int getNutrition_id() {
		return nutrition_id;
	}

	public void setNutrition_id(int nutrition_id) {
		this.nutrition_id = nutrition_id;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
	
}
