package cn.simon.singleton.entity;

// singleton pattern

public class LoginUser {
	
	private LoginUser(){
		
	}
	
	private static class LoginUserHolder {
		private static LoginUser loginUser = new LoginUser();
	}
	
	public static LoginUser getInstance(){
		return LoginUserHolder.loginUser;
	}
	
	private String userName = null;
	
	public void setUserName(String uName){
		userName = uName;
	}
	
	public String getUserName(){
		return userName;
	}
}
