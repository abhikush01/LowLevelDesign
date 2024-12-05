package BehavioralPattern.ObserverPattern.Wheather;

public class Main {

	public static void main(String[] args) {
		
		Subject sub = new Wheather();
		Observer obj1 = new TvDisplay();
		Observer obj2 = new PhoneDisplay();
		sub.setData(10);
		sub.addObserver(obj1);
		sub.addObserver(obj2);
		sub.setData(20);
		sub.setData(39);
	}

}
