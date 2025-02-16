package InterviewQuestions.VendingMachine.State;

import java.util.List;

import InterviewQuestions.VendingMachine.ItemType;
import InterviewQuestions.VendingMachine.Note;
import InterviewQuestions.VendingMachine.Product;
import InterviewQuestions.VendingMachine.VendingMachine;

public class DispenseState implements State {
	
	private Product product;
	
	DispenseState(Product product){
        System.out.println("Currently Vending machine is in DispenseState");
        this.product = product;
    }


	@Override
	public void clickOnInsertButton(VendingMachine machine) {
		System.out.println("insert coin button can not clicked on Dispense state");
	}

	@Override
	public void clickOnSelectButton(VendingMachine machine) {
		System.out.println("select button can not clicked on Dispense state");
	}

	@Override
	public void insertCoins(VendingMachine machine, Note note) {
		System.out.println("coins can not be inserted in Dispense state");
	}

	@Override
	public void selectItem(VendingMachine machine, ItemType type) {
		System.out.println("Item can not be selected in Dispense state");
	}

	@Override
	public Product dispenseItem(VendingMachine machine) {
		System.out.println(product.getItemType() + " : Has been dispensed");
		machine.setState(new IdleState(machine));
		return product;
	}

	@Override
	public List<Note> refund(VendingMachine machine) {
		System.out.println("refund can not returned in Dispense state");
		return null;
	}

	@Override
	public void getChange(double price) {
		System.out.println("change can not returned in Dispense state");
	}

}
