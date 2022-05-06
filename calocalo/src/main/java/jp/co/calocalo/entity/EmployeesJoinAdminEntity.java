package jp.co.calocalo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeesJoinAdminEntity {

	@Id
	private int emp_id;
	
	@Column
<<<<<<< HEAD
	private int goal_calorie;
=======
	private int goal_calories;
>>>>>>> da7870820b90a264d99c05e19ebdd7f9e2371bdc
	
	@ManyToOne
	@JoinColumn(name = "admin_id", referencedColumnName = "admin_id")
	private AdminEntity adminEntity;
	
	@Column
	private int password;
	
	@Column
	private boolean is_delete;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

<<<<<<< HEAD
	public int getGoal_calorie() {
		return goal_calorie;
	}

	public void setGoal_calorie(int goal_calorie) {
		this.goal_calorie = goal_calorie;
=======
	public int getGoal_calories() {
		return goal_calories;
	}

	public void setGoal_calories(int goal_calories) {
		this.goal_calories = goal_calories;
>>>>>>> da7870820b90a264d99c05e19ebdd7f9e2371bdc
	}

	public AdminEntity getAdminEntity() {
		return adminEntity;
	}

	public void setAdminEntity(AdminEntity adminEntity) {
		this.adminEntity = adminEntity;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public boolean isIs_delete() {
		return is_delete;
	}

	public void setIs_delete(boolean is_delete) {
		this.is_delete = is_delete;
	}
}
	
