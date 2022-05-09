package jp.co.calocalo.Dto;

import java.sql.Date;

public class TotalCaloriesDto {
	
	private Integer total_calories;
	private Date date;
	private Boolean existance;
	
	
	public Integer getTotal_calories() {
		return total_calories;
	}
	public void setTotal_calories(Integer total_calories) {
		this.total_calories = total_calories;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Boolean getExistance() {
		return existance;
	}
	public void setExistance(Boolean existance) {
		this.existance = existance;
	}
	
	

}
