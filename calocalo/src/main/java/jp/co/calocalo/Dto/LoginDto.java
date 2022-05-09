package jp.co.calocalo.Dto;

public class LoginDto {
	
	private boolean login_status;
	private int admin_status;
	
	
	
	public boolean isLogin_status() {
		return login_status;
	}
	public void setLogin_status(boolean login_status) {
		this.login_status = login_status;
	}
	public int getAdmin_status() {
		return admin_status;
	}
	public void setAdmin_status(int admin_status) {
		this.admin_status = admin_status;
	}
	
}
