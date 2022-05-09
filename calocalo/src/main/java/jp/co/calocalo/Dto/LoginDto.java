package jp.co.calocalo.Dto;

public class LoginDto {
	
	private boolean login_status;
	private int admin_id;
	
	
	
	
	public boolean isLogin_status() {
		return login_status;
	}
	public void setLogin_status(boolean login_status) {
		this.login_status = login_status;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	
	
}
