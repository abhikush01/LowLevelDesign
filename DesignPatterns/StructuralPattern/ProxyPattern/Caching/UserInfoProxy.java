package DesignPatterns.StructuralPattern.ProxyPattern.Caching;

public class UserInfoProxy implements UserInfo {

	UserInfoImpl userInfo;
	String name;
	String email;
	
	UserInfoProxy(String name , String email){
		this.email = email;
		this.name = name;
	}
	
	@Override
	public void display() {
		if(userInfo == null) {
			userInfo = new UserInfoImpl(name,email);
		}
		userInfo.display();
	}

}
