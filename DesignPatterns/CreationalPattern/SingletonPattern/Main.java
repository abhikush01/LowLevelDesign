package DesignPatterns.CreationalPattern.SingletonPattern;

public class Main {

	public static void main(String[] args) {
		
		EagerSingleton e1 = EagerSingleton.getInstance();
		EagerSingleton e2 = EagerSingleton.getInstance();
		System.out.println(e1 == e2);

		
		LazySingleton l1 = LazySingleton.getInstance();
		LazySingleton l2 = LazySingleton.getInstance();
		System.out.println(l1 == l2);
		
		
		SynchronizedMethod s1 = SynchronizedMethod.getInstance();
		SynchronizedMethod s2 = SynchronizedMethod.getInstance();
		System.out.println(s1 == s2);
		
		DoubleLocking d1 = DoubleLocking.getInstance();
		DoubleLocking d2 = DoubleLocking.getInstance();
		System.out.println(d1 == d2);
	}

}
