package jp.co.calocalo.Dto;

import java.sql.Date;

public class LogDto {
	
	private int emp_id;
	private Date date;
	private int gaol_calorie;
	private int total_calorie;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getGaol_calorie() {
		return gaol_calorie;
	}
	public void setGaol_calorie(int gaol_calorie) {
		this.gaol_calorie = gaol_calorie;
	}
	public int getTotal_calorie() {
		return total_calorie;
	}
	public void setTotal_calorie(int total_calorie) {
		this.total_calorie = total_calorie;
	}
	
	

}
