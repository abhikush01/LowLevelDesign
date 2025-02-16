package InterviewQuestions.VendingMachine;

import java.util.ArrayList;
import java.util.List;

import InterviewQuestions.VendingMachine.State.State;

public class VendingMachine {
	
	State state;
	Inventory inventory;
	List<Note> notes;
	
	VendingMachine(Inventory inventory){
		this.inventory = inventory;
	}
	
	public void addNote(Note note) {
		notes.add(note);
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return this.state;
	}
	
	public Inventory getInventory() {
		return this.inventory;
	}
	
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public List<Note> getListOfNotes() {
		List<Note> curr = notes;
		notes = new ArrayList<>();
		return curr;
	}
	
	public void setNoteList(List<Note> list) {
		this.notes = list;
	}
	
}
