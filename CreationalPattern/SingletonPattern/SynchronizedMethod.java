package CreationalPattern.SingletonPattern;

public class SynchronizedMethod {
    private static SynchronizedMethod singleton;
	
	private SynchronizedMethod(){}
	
	public synchronized static SynchronizedMethod getInstance() {
		if(singleton == null) {
			singleton = new SynchronizedMethod();
		}
		return singleton;
	}
}
