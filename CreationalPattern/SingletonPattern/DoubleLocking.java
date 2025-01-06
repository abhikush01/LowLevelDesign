package CreationalPattern.SingletonPattern;

public class DoubleLocking {
	private static volatile DoubleLocking singleton;
	
	private DoubleLocking(){}
	
	public static DoubleLocking getInstance() {
		if(singleton == null) {
			synchronized(DoubleLocking.class) {
				if(singleton == null) {
					singleton = new DoubleLocking();
				}
			}
		}
		return singleton;
	}
}
