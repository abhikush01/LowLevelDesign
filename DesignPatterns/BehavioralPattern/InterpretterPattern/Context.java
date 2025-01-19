package DesignPatterns.BehavioralPattern.InterpretterPattern;

import java.util.HashMap;

public class Context {
	
	HashMap<String,Integer> map;
	
	Context(){
		map = new HashMap<>();
	}
	
	public void put(String key, int value) {
		map.put(key, value);
	}
	
	public int get(String key) {
		return map.get(key);
	}
}	
