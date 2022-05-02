package jp.co.calocalo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.calocalo.entity.NutritionEntity;

public interface NutritionRepository extends JpaRepository<NutritionEntity, Integer> {
	
}
