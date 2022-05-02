package jp.co.calocalo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "food_list")
public class FoodListJoinNutritionEntity {

	@Id
	private int food_id;
	
	@Column
	private int food_name;
	
	@ManyToOne
	@JoinColumn(name = "nutrition_id", referencedColumnName = "nutrition_id")
	private NutritionEntity nutritionEntity;

	public int getFood_id() {
		return food_id;
	}

	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}

	public int getFood_name() {
		return food_name;
	}

	public void setFood_name(int food_name) {
		this.food_name = food_name;
	}

	public NutritionEntity getNutritionEntity() {
		return nutritionEntity;
	}

	public void setNutritionEntity(NutritionEntity nutritionEntity) {
		this.nutritionEntity = nutritionEntity;
	}
}
