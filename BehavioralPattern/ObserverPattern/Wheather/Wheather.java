package BehavioralPattern.ObserverPattern.Wheather;

import java.util.*;

public class Wheather implements Subject {
	
	List<Observer> list = new ArrayList<>();
	int i;

	@Override
	public void addObserver(Observer obj) {
		// TODO Auto-generated method stub
		list.add(obj);
	}

	@Override
	public void removeObserver(Observer obj) {
		// TODO Auto-generated method stub
		list.remove(obj);
	}

	@Override
	public void updateObserver() {
		// TODO Auto-generated method stub
		for(Observer obj : list) obj.update(this);
	}

	@Override
	public int getData() {
		return i;
	}

	@Override
	public void setData(int i) {
		this.i = i;
		updateObserver();
	}

}
