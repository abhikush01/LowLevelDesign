package DesignPatterns.StructuralPattern.ProxyPattern.Caching;

public class Main {
	public static void main(String[] args) {
		UserInfo userInfo = new UserInfoProxy("Abhishek" , "test@gmail.com");
		System.out.println("new Object");
		userInfo.display();
		System.out.println("Cached data");	
		userInfo.display();
				
	}
}
