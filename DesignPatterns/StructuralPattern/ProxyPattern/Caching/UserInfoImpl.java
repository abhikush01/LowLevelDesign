package DesignPatterns.StructuralPattern.ProxyPattern.Caching;

public class UserInfoImpl implements UserInfo {
	
	String name;
	String email;
	
	UserInfoImpl(String name , String email){
		this.name = name;
		this.email = email;
		System.out.println("Object is Creating.......");
	}
	
	@Override
	public void display() {
		System.out.println("name : " + name);
		System.out.println("email : " + email);
	}

}
