package jp.co.calocalo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "calories_records")
public class CaloriesRecordsJoinEmployeesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int record_id;
	
	@ManyToOne
	@JoinColumn(name = "emp_id", referencedColumnName = "emp_id")
	private EmployeesJoinAdminEntity employeesJoinAdminEntity;
	
	@Column
	private int tatal_calories;
	
	@Column
	private Date date;

	public int getRecord_id() {
		return record_id;
	}

	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}

	public EmployeesJoinAdminEntity getEmployeesJoinAdminEntity() {
		return employeesJoinAdminEntity;
	}

	public void setEmployeesJoinAdminEntity(EmployeesJoinAdminEntity employeesJoinAdminEntity) {
		this.employeesJoinAdminEntity = employeesJoinAdminEntity;
	}
	
	public int getTatal_calories() {
		return tatal_calories;
	}

	public void setTatal_calories(int tatal_calories) {
		this.tatal_calories = tatal_calories;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
