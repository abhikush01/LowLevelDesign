package InterviewQuestions.VendingMachine.State;

import java.util.List;

import InterviewQuestions.VendingMachine.ItemType;
import InterviewQuestions.VendingMachine.Note;
import InterviewQuestions.VendingMachine.Product;
import InterviewQuestions.VendingMachine.VendingMachine;

public class HasMoneyState implements State {

	HasMoneyState(){
		System.out.println("Currently Vending Machine in Has Money State");
	}
	
	@Override
	public void clickOnInsertButton(VendingMachine machine) {
		return ;
	}

	@Override
	public void insertCoins(VendingMachine machine, Note note) {
		System.out.println("Added a note");
		machine.addNote(note);
	}

	@Override
	public void selectItem(VendingMachine machine, ItemType type) {
		System.out.println("Currently Vending Machine in Has Money State cannot select item");
	}

	@Override
	public Product dispenseItem(VendingMachine machine) {
		System.out.println("first Select item");
		return null;
	}

	@Override
	public List<Note> refund(VendingMachine machine) {
		System.out.println("Refunded full amount: "+ machine.getListOfNotes());
		List<Note> curr = machine.getListOfNotes();
		machine.setState(new IdleState(machine));
		return curr;
	}

	@Override
	public void getChange(double price) {
		System.out.println("Only refund can be done not change");
	}

	@Override
	public void clickOnSelectButton(VendingMachine machine) {
		machine.setState(new SelectionState());
	}

}
