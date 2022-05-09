package jp.co.calocalo.form;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UpdateTotalCaloriesForm {

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date;
	private Integer takeFoodCalorie;
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getTakeFoodCalorie() {
		return takeFoodCalorie;
	}
	public void setTakeFoodCalorie(Integer takeFoodCalorie) {
		this.takeFoodCalorie = takeFoodCalorie;
	}
	
	
}
