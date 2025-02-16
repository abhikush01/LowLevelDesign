package InterviewQuestions.VendingMachine.State;

import java.util.ArrayList;
import java.util.List;

import InterviewQuestions.VendingMachine.ItemType;
import InterviewQuestions.VendingMachine.Note;
import InterviewQuestions.VendingMachine.Product;
import InterviewQuestions.VendingMachine.VendingMachine;

public class IdleState implements State {
	
	public IdleState(){
        System.out.println("Currently Vending machine is in IdleState");
    }
	
	public IdleState(VendingMachine machine){
        System.out.println("Currently Vending machine is in IdleState");
        machine.setNoteList(new ArrayList<>());
    }

	@Override
	public void clickOnInsertButton(VendingMachine machine) {
		System.out.println("Insert Coin button activated");
		machine.setState(new HasMoneyState());
	}

	@Override
	public void insertCoins(VendingMachine machine, Note note) {
		System.out.println("Please click on Insert Button");
	}

	@Override
	public Product dispenseItem(VendingMachine machine) {
		System.out.println("Please click on Insert Button");
		return null;
	}

	@Override
	public List<Note> refund(VendingMachine machine) {
		System.out.println("Please click on Insert Button");
		return null;
	}

	@Override
	public void getChange(double price) {
		System.out.println("Please click on Insert Button");
	}

	@Override
	public void selectItem(VendingMachine machine, ItemType type) {
		System.out.println("Please click on Insert Button");
	}

	@Override
	public void clickOnSelectButton(VendingMachine machine) {
		System.out.println("Please click on Insert Button");
	}

}
