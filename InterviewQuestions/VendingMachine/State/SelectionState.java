package InterviewQuestions.VendingMachine.State;

import java.util.List;

import InterviewQuestions.VendingMachine.ItemType;
import InterviewQuestions.VendingMachine.Note;
import InterviewQuestions.VendingMachine.Product;
import InterviewQuestions.VendingMachine.VendingMachine;

public class SelectionState implements State {
	
	public SelectionState(){
        System.out.println("Currently Vending machine is in SelectionState");
    }


	@Override
	public void clickOnInsertButton(VendingMachine machine) {
		machine.setState(new HasMoneyState());
	}

	@Override
	public void clickOnSelectButton(VendingMachine machine) {
		return;
	}

	@Override
	public void insertCoins(VendingMachine machine, Note note) {
		System.out.println("Currently Machine in selection State please select an item");
	}

	@Override
	public void selectItem(VendingMachine machine, ItemType type) {
		Product product = machine.getInventory().getItem(type);
		
		if(product != null) {
			double coinsInserted = 0;
			
			for(Note num : machine.getListOfNotes()) {
				coinsInserted += num.getValue();
			}
			
			if(coinsInserted >= product.getPrice()) {
				if(coinsInserted > product.getPrice()) {
					getChange(coinsInserted - product.getPrice());
				}
				machine.setState(new DispenseState(product));
			}
			else {
				System.out.println("Insufficient Amount refund Insiated");
				machine.getInventory().addProducts(type, 1);
				refund(machine);
			}
		}
	}

	@Override
	public Product dispenseItem(VendingMachine machine) {
		System.out.println("Currently Machine in selection State please select an item");
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
		System.out.println("Returned the change : " + price);
	}

}
