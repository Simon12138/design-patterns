package cn.simon.singleton.main;

import cn.simon.singleton.entity.LoginUser;

public class SingletonMain {

	public static void main(String[] args) {
		LoginUser user1 = LoginUser.getInstance();
		user1.setUserName("Tom");
		LoginUser user2 = LoginUser.getInstance();
		user2.setUserName("Jack");
		System.out.println(user1.getUserName());
	}
}
