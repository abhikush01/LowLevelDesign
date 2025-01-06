package CreationalPattern.SingletonPattern;

public class EagerSingleton {
	private static EagerSingleton singleton = new EagerSingleton();
	
	private EagerSingleton(){}
	
	public static EagerSingleton getInstance() {
		return singleton;
	}
}
