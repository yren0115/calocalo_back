package jp.co.calocalo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.calocalo.entity.FoodListEntity;

public interface FoodListJoinNutritionRepository extends JpaRepository<FoodListEntity, Integer> {

}
