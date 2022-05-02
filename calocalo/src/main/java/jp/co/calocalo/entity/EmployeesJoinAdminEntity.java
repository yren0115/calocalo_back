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
	private int goal_id;
	
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

	public int getGoal_id() {
		return goal_id;
	}

	public void setGoal_id(int goal_id) {
		this.goal_id = goal_id;
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
	
