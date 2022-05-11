package jp.co.calocalo.form;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UpdateTotalCaloriesForm {

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date;
	private Integer take_calorie;
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getTake_calorie() {
		return take_calorie;
	}
	public void setTake_calorie(Integer take_calorie) {
		this.take_calorie = take_calorie;
	}
	
	
}
