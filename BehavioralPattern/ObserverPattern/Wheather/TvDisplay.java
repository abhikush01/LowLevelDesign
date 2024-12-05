package BehavioralPattern.ObserverPattern.Wheather;

public class TvDisplay implements Observer {

	@Override
	public void update(Subject sub) {
		
		System.out.println("Tv display Updated data "+sub.getData());		
	}

}
